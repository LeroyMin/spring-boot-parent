package cn.weizhis.shiro.service.impl;

import com.alibaba.fastjson.JSONObject;
import cn.weizhis.shiro.entity.UserInfo;
import cn.weizhis.shiro.service.UserInfoService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

/**
 * Created by minlee on 2018/4/6.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Override
    public JSONObject getUserInfoById(String userId) {
        return null;
    }

    @Override
    public UserInfo getUserInfoByName(String userName) {
        return null;
    }

    @Override
    public Page<JSONObject> pageQueryUser() {
        return null;
    }

    @Override
    public Integer createUser(UserInfo userInfo) {
        return null;
    }

    @Override
    public Integer updateUser(UserInfo userInfo) {
        return null;
    }

    @Override
    public Integer deleteUser(UserInfo userInfo) {
        return null;
    }
}
