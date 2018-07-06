package cn.weizhis.shiro.service.impl;

import cn.weizhis.shiro.dao.SysPermissionDao;
import cn.weizhis.shiro.entity.SysPermission;
import cn.weizhis.shiro.service.SysPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by minlee on 2018/4/6.
 */
@Service("sysPermissionService")
public class SysPermissionServiceImpl implements SysPermissionService {

    @Autowired
    private SysPermissionDao permissionDao;

    @Override
    public SysPermission getPermissionsById(SysPermission permission) {
        SysPermission result = permissionDao.selectOne(permission);
        return result;
    }

    @Override
    public List<SysPermission> getPermissionByIds(List<Long> pIds) {
        List<SysPermission> result = new ArrayList<>();
        for (Long id : pIds) {
            SysPermission permission = new SysPermission();
            permission.setId(id);
            result.add(permissionDao.selectOne(permission));
        }
        return result;
    }

    @Override
    public SysPermission getPermissionsById(Long permissionId) {
        return null;
    }
}
