package com.weizhis.shiro.service;

import com.alibaba.fastjson.JSONObject;
import com.weizhis.shiro.entity.SysPermission;

import java.util.List;

/**
 * Created by minlee on 2018/3/11.
 */
public interface SysPermissionService {

    /**
     * 通过资源ID获取资源信息
     */
    JSONObject getPermissionById(String pId);

    /**
     * 通过资源ID集合获取资源信息
     */
    JSONObject getPermissionByIds(List<String> pIds);

    Integer createPermission(SysPermission permission);

    Integer updatePermission(SysPermission permission);

    Integer deletePermission(SysPermission permission);

}
