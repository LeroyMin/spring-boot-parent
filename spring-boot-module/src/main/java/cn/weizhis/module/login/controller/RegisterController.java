package cn.weizhis.module.login.controller;

import cn.weizhis.common.component.Receipt;
import cn.weizhis.module.login.dto.UserInfoDTO;
import cn.weizhis.module.login.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by minlee on 2018/4/7.
 */
@RestController
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    /**
     * 用户注册
     * @param userInfoDTO
     * @return
     */
    @RequestMapping(value = "/register")
    public Receipt register(UserInfoDTO userInfoDTO){
        Receipt result = new Receipt();
        try{
            Integer data = registerService.register(userInfoDTO);
            result.setData(data);
        }catch (Exception e){
            result.failure(e.getMessage());
        }
        return result;
    }

}
