package cn.weizhis.module.user.service.impl;

import cn.weizhis.module.user.dao.SysRoleDao;
import cn.weizhis.module.user.entity.RolePermission;
import cn.weizhis.module.user.entity.SysRole;
import cn.weizhis.module.user.entity.UserInfo;
import cn.weizhis.module.user.entity.UserRole;
import cn.weizhis.module.user.service.SysPermissionService;
import cn.weizhis.module.user.service.SysRoleService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by minlee on 2018/3/11.
 */
//@Service
public class SysRoleServiceImpl implements SysRoleService {
    @Autowired
    SysPermissionService permissionService;

    @Autowired
    SysRoleDao sysRoleDao;

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
      return null;
    }

    @Override
    public List<RolePermission> getPermissionsByRole(UserRole role) {
        return null;
    }
}
