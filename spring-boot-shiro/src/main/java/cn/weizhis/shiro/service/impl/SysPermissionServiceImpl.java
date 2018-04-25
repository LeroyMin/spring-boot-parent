package cn.weizhis.shiro.service.impl;

import cn.weizhis.shiro.repository.SysPermissionRepository;
import com.alibaba.fastjson.JSONObject;
import cn.weizhis.shiro.entity.SysPermission;
import cn.weizhis.shiro.service.SysPermissionService;
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
