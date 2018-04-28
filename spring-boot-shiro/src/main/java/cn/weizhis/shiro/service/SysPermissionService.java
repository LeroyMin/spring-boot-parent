package cn.weizhis.shiro.service;

import cn.weizhis.shiro.entity.SysPermission;

import java.util.List;

/**
 * Created by minlee on 2018/3/11.
 */
public interface SysPermissionService {

    /**
     * 通过资源ID获取所有资源信息
     */
    SysPermission getPermissionsById(SysPermission permission);


    /**
     * 通过资源ID获取所有资源信息
     */
    SysPermission getPermissionsById(Long permissionId);

    /**
     * 通过资源ID集合获取资源信息
     */
    List<SysPermission> getPermissionByIds(List<Long> pIds);

}
