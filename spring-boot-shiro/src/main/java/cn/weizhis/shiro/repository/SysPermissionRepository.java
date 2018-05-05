package cn.weizhis.shiro.repository;

import cn.weizhis.shiro.entity.SysPermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by minlee on 2018/3/11.
 */
public interface SysPermissionRepository extends JpaRepository<SysPermission, String> {

    @Query("select t from SysPermission t")
    List<SysPermission> findPerssionByRoleId();
}
