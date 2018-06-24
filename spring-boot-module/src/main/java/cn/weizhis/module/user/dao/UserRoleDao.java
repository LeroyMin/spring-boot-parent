package cn.weizhis.module.user.dao;


import cn.weizhis.common.datadomain.BaseDao;
import cn.weizhis.module.user.entity.UserRole;

import java.util.List;

/**
 * 用户角色信息 目的是让shiro包能独立运行
 */
public interface UserRoleDao extends BaseDao<UserRole> {

    /**
     * 通过用户ID查询用户角色信息
     * @param userId
     * @return
     */
    List<UserRole> selectUserRoleByUserId(Long userId);
}
