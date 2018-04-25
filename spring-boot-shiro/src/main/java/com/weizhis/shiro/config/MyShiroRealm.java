package com.weizhis.shiro.config;

import com.weizhis.shiro.entity.SysPermission;
import com.weizhis.shiro.entity.SysRole;
import com.weizhis.shiro.entity.UserInfo;
import com.weizhis.shiro.service.UserInfoService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import javax.annotation.Resource;

/**
 * Created by minlee on 2018/3/11.
 */
public class MyShiroRealm extends AuthorizingRealm {

    @Resource
    private UserInfoService userInfoService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        UserInfo userInfo = (UserInfo) principalCollection.getPrimaryPrincipal();
        try{
            for (SysRole role : userInfo.getRoles()){
                authorizationInfo.addRole(role.getId());
                for (SysPermission permission : role.getPermissions()) {
                    authorizationInfo.addStringPermission(permission.getPermission());
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String userName = (String) authenticationToken.getPrincipal();
        //通过username从数据库中查找 User对象，如果找到，没找到.
        //实际项目中，这里可以根据实际情况做缓存，如果不做，Shiro自己也是有时间间隔机制，2分钟内不会重复执行该方法
        UserInfo userInfo = userInfoService.getUserInfoByName(userName);
        if (userInfo == null){
            return null;
        }
        if (userInfo.getState() == 1) {
            throw new LockedAccountException();
        }
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                userInfo,
                userInfo.getPassword(),
                ByteSource.Util.bytes(userInfo.getCredentialsSalt()),
                getName()
        );
        return null;
    }
}
