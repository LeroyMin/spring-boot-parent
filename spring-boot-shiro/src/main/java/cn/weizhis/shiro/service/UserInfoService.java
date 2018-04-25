package cn.weizhis.shiro.service;

import com.alibaba.fastjson.JSONObject;
import cn.weizhis.shiro.entity.UserInfo;
import org.springframework.data.domain.Page;

/**
 * Created by minlee on 2018/3/11.
 */
public interface UserInfoService {
    JSONObject getUserInfoById(String userId);

    UserInfo getUserInfoByName(String userName);

    Page<JSONObject> pageQueryUser();

    Integer createUser(UserInfo userInfo);

    Integer updateUser(UserInfo userInfo);

    Integer deleteUser(UserInfo userInfo);

}
