package com.weizhis.shiro.service;

import com.alibaba.fastjson.JSONObject;
import com.weizhis.shiro.entity.SysRole;
import com.weizhis.shiro.entity.UserInfo;

import java.util.List;

/**
 * Created by minlee on 2018/3/11.
 */
public interface SysRoleService {

    /**
     * 通过角色ID获取角色信息
     * @return
     */
    JSONObject getRoleById(String roleId);

    /**
     * 通过角色ID列表获取角色信息
     * @return
     */
    JSONObject getRoleById(List<String> roleIds);

    /**
     * 通过角色ID查询匹配的角色列表
     * @param roleId
     * @return
     */
    List<SysRole> queryRolesById(String roleId);

    /**
     * 通过用户信息查询匹配的角色列表
     * @param userInfo
     * @return
     */
    List<SysRole> queryRolesByUser(UserInfo userInfo);

    Integer createRole(SysRole role);

    Integer updateRole(SysRole role);

    Integer deleteRole(SysRole role);

}
