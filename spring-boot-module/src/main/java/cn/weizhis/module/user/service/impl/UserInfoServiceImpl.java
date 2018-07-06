package cn.weizhis.module.user.service.impl;

import cn.weizhis.common.component.Page;

import cn.weizhis.module.user.dao.UserInfoDao;
import cn.weizhis.module.user.dao.UserRoleDao;
import cn.weizhis.module.user.entity.UserInfo;
import cn.weizhis.module.user.entity.UserRole;
import cn.weizhis.module.user.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by minlee on 2018/4/6.
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;

    @Autowired
    private UserRoleDao userRoleDao;

    /**
     * 根据用户ID查询用户信息
     * @param paramter
     * @return
     */
    @Override
    public UserInfo getUserInfoById(UserInfo paramter) {
        UserInfo result = userInfoDao.selectOne(paramter);
        return result;
    }

    /**
     * 根据用户名查询用户信息
     * @param paramter
     * @return
     */
    @Override
    public UserInfo getUserInfoByName(UserInfo paramter) {
        UserInfo result = userInfoDao.selectUserByName(paramter);
        return result;
    }

    /**
     * 分页查询用户信息
     * @param page
     * @return
     */
    @Override
    public Page<UserInfo> pageQueryUser(Page page) {
        Page<UserInfo> result = userInfoDao.selectAllByPage(page);
        return result;
    }

    /**
     * 通过用户名查询用户角色信息
     * @param paramter
     * @return
     */
    @Override
    public List<UserRole> getUserRoleByUserName(UserInfo paramter) {
        UserInfo userResult = userInfoDao.selectUserByName(paramter);
        if (userResult == null){
            return null;
        }
        List<UserRole> roleList = userRoleDao.selectUserRoleByUserId(userResult.getId());
        return roleList;
    }

    /**
     * 通过用户ID查询用户角色信息
     * @param paramter
     * @return
     */
    @Override
    public List<UserRole> getUserRoleById(UserInfo paramter) {
        List<UserRole> roleList = userRoleDao.selectUserRoleByUserId(paramter.getId());
        return roleList;
    }

    /**
     * 新增用户
     * @param paramter
     * @return
     */
    @Override
    public void addUser(UserInfo paramter) {
        userInfoDao.insert(paramter);
    }
}
