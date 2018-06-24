package cn.weizhis.module.user.dao;

import cn.weizhis.common.datadomain.BaseDao;
import cn.weizhis.module.user.entity.UserInfo;

public interface UserInfoDao extends BaseDao<UserInfo> {

    /**
     * 通过用户名查询用户信息
     * @param userDTO
     * @return
     */
    UserInfo selectUserByName(UserInfo userDTO);
}
