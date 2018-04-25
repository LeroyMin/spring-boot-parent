package com.weizhis.shiro.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.weizhis.shiro.entity.SysPermission;
import com.weizhis.shiro.entity.SysRole;
import com.weizhis.shiro.entity.UserInfo;
import com.weizhis.shiro.repository.SysPermissionRepository;
import com.weizhis.shiro.service.SysPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by minlee on 2018/4/6.
 */
@Service
public class SysPermissionServiceImpl implements SysPermissionService {

    @Autowired
    SysPermissionRepository permissionRepository;
    @Override
    public JSONObject getPermissionById(String pId) {
        return null;
    }

    @Override
    public JSONObject getPermissionByIds(List<String> pIds) {
        return null;
    }

    @Override
    public Integer createPermission(SysPermission permission) {
        return null;
    }

    @Override
    public Integer updatePermission(SysPermission permission) {
        return null;
    }

    @Override
    public Integer deletePermission(SysPermission permission) {
        return null;
    }
}
