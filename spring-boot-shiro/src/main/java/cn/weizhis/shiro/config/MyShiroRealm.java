package cn.weizhis.shiro.config;

import cn.weizhis.shiro.entity.RolePermission;
import cn.weizhis.shiro.entity.SysPermission;
import cn.weizhis.shiro.entity.UserInfo;
import cn.weizhis.shiro.entity.UserRole;
import cn.weizhis.shiro.service.SysPermissionService;
import cn.weizhis.shiro.service.SysRoleService;
import cn.weizhis.shiro.service.UserInfoService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by minlee on 2018/3/11.
 */
public class MyShiroRealm extends AuthorizingRealm {

    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private SysPermissionService permissionService;

    @Autowired
    private SysRoleService roleService;


    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        UserInfo userInfo = (UserInfo) principalCollection.getPrimaryPrincipal();
        try{
            List<UserRole> roleList = userInfoService.getUserRoleByUserName(userInfo);
            for (UserRole userRole : roleList) {
                authorizationInfo.addRole(userRole.getId().toString());
                List<RolePermission> rolePermissionList = roleService.getPermissionsByRole(userRole);
                for (RolePermission rolePermission : rolePermissionList){
                    SysPermission permission = permissionService.getPermissionsById(rolePermission.getpId());
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
        UserInfo userInfo = new UserInfo();
        userInfo.setName(userName);
        UserInfo userInfoRes = userInfoService.getUserInfoByName(userInfo);
        if (userInfoRes == null){
            return null;
        }
        if (userInfoRes.getStatus() == 1) {
            throw new LockedAccountException();
        }
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                userInfo,
                userInfo.getPassword(),
                ByteSource.Util.bytes(userInfo.getCredentialsSalt()),
                getName()
        );
        return authenticationInfo;
    }
}
