package cn.weizhis.shiro.repository;

import cn.weizhis.shiro.entity.SysRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by minlee on 2018/3/11.
 */
public interface SysRoleRepository extends JpaRepository<SysRole, String> {

    @Query("select r from SysRole r where r.id=:id")
    SysRole findRoleById(@Param("id") String id);
}
