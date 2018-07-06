package cn.weizhis.module.login.service.impl;

import cn.weizhis.common.utils.BeanUtils;
import cn.weizhis.module.login.dto.UserInfoDTO;
import cn.weizhis.module.login.service.RegisterService;
import cn.weizhis.module.user.entity.UserInfo;
import cn.weizhis.module.user.service.SysPermissionService;
import cn.weizhis.module.user.service.SysRoleService;
import cn.weizhis.module.user.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by minlee on 2018/4/7.
 */
@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private SysRoleService roleService;

    @Autowired
    private SysPermissionService permissionService;

    @Override
    public Integer register(UserInfoDTO userInfoDTO) {
        UserInfo userInfo = (UserInfo) BeanUtils.convertBean(userInfoDTO, UserInfo.class);
        userInfoService.addUser(userInfo);
        return null;
    }
}
