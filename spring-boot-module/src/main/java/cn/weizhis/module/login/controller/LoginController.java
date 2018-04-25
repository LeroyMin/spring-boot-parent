package cn.weizhis.module.login.controller;

import cn.weizhis.common.component.Receipt;
import cn.weizhis.module.login.dto.UserInfoDTO;
import cn.weizhis.module.login.enumeration.LoginEnum;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by minlee on 2018/4/6.
 */
@RestController
public class LoginController {

    /**
     * 登录
     * @param userInfo
     * @return
     */
    @RequestMapping(value = "/login")
    @ResponseBody
    public Receipt login(UserInfoDTO userInfo){
        Receipt result = new Receipt();
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(userInfo.getUserName(), userInfo.getPasswords());
        try{
            subject.login(token);
            result.setData(subject.getSession().getId());
        }catch (IncorrectCredentialsException e){
            result.failure(LoginEnum.LOGIN_PASSWORD_INVALID.getLoginCode(), LoginEnum.LOGIN_PASSWORD_INVALID.getMsg());
        }catch (LockedAccountException e){
            result.failure(LoginEnum.LOGIN_STATE_INVALID.getLoginCode(), LoginEnum.LOGIN_STATE_INVALID.getMsg());
        }catch (AuthenticationException e){
            result.failure(LoginEnum.LOGIN_NO_USER.getLoginCode(), LoginEnum.LOGIN_NO_USER.getMsg());
        } catch (Exception e){
            result.failure(LoginEnum.LOGIN_SERVICE_ERROR.getLoginCode(), LoginEnum.LOGIN_SERVICE_ERROR.getMsg());
        }
        return result;
    }

    /**
     * 未登录，shiro应重定向到登录界面，此处返回未登录状态信息由前端控制跳转页面
     * @return
     */
    @RequestMapping(value = "/unauth")
    @ResponseBody
    public Object unauth() {
        Receipt result = new Receipt();
        result.failure(LoginEnum.LOGIN_NOT_LOGIN.getLoginCode(), LoginEnum.LOGIN_NOT_LOGIN.getMsg());
        return result;
    }
}
