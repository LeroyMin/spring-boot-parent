package cn.weizhis.shiro.dao;

import cn.weizhis.common.datadomain.BaseDao;
import cn.weizhis.shiro.entity.UserInfo;

public interface UserInfoDao extends BaseDao<UserInfo> {

    /**
     * 通过用户名查询用户信息
     * @param userDTO
     * @return
     */
    UserInfo selectUserByName(UserInfo userDTO);
}
