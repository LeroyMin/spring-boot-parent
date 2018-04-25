package com.weizhis.shiro.service;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by minlee on 2018/3/11.
 */
public interface SysUserService {

    /**
     * 通过ID获取用户信息
     * @param object
     * @return
     */
    JSONObject getUserById(Object object);

    /**
     * 通过用户名获取用户信息
     * @return
     */
    JSONObject getUserByName();



}
