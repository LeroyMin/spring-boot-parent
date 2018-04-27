package cn.weizhis.shiro.service;

import cn.weizhis.common.component.Page;
import cn.weizhis.shiro.entity.UserInfo;
import cn.weizhis.shiro.entity.UserRole;

import java.util.List;

/**
 * Created by minlee on 2018/3/11.
 */
public interface UserInfoService {

    /**
     * 根据用户ID查询用户信息
     * @param paramter
     * @return
     */
    UserInfo getUserInfoById(UserInfo paramter);

    /**
     * 根据用户名查询用户信息
     * @param paramter
     * @return
     */
    UserInfo getUserInfoByName(UserInfo paramter);

    /**
     * 分页查询用户信息
     * @param page
     * @return
     */
    Page<UserInfo> pageQueryUser(Page page);

    /**
     * 通过用户名查询用户角色信息
     * @param paramter
     * @return
     */
    List<UserRole> getUserRoleByUserName(UserInfo paramter);

    /**
     * 通过用户ID查询用户角色信息
     * @param paramter
     * @return
     */
    List<UserRole> getUserRoleById(UserInfo paramter);

}
