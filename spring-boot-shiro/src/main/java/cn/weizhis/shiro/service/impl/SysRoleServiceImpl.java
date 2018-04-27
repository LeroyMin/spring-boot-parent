package cn.weizhis.shiro.service.impl;

import cn.weizhis.shiro.dao.SysRoleDao;
import cn.weizhis.shiro.repository.SysRoleRepository;
import cn.weizhis.shiro.repository.UserInfoRepository;
import cn.weizhis.shiro.service.SysPermissionService;
import com.alibaba.fastjson.JSONObject;
import cn.weizhis.shiro.entity.SysRole;
import cn.weizhis.shiro.entity.UserInfo;
import cn.weizhis.shiro.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by minlee on 2018/3/11.
 */
@Service
public class SysRoleServiceImpl implements SysRoleService{
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
