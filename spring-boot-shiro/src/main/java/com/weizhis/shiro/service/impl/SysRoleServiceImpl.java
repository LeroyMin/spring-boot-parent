package com.weizhis.shiro.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.weizhis.shiro.entity.SysRole;
import com.weizhis.shiro.entity.UserInfo;
import com.weizhis.shiro.repository.SysRoleRepository;
import com.weizhis.shiro.repository.UserInfoRepository;
import com.weizhis.shiro.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by minlee on 2018/3/11.
 */
@Service
public class SysRoleServiceImpl implements SysRoleService{
    @Autowired
    UserInfoRepository userInfoRepository;

    @Autowired
    SysRoleRepository roleRepository;

    @Override
    public JSONObject getRoleById(String roleId) {
        return null;
    }

    @Override
    public JSONObject getRoleById(List<String> roleIds) {
        return null;
    }

    @Override
    public List<SysRole> queryRolesById(String roleId) {
        return null;
    }

    @Override
    public List<SysRole> queryRolesByUser(UserInfo userInfo) {
        if (userInfo == null) {
            throw new IllegalArgumentException("null user Info");
        }
        UserInfo userRes = userInfoRepository.findOne(userInfo.getId());
        return userRes.getRoles();
    }

    @Override
    public Integer createRole(SysRole role) {
        return null;
    }

    @Override
    public Integer updateRole(SysRole role) {
        return null;
    }

    @Override
    public Integer deleteRole(SysRole role) {
        return null;
    }
}
