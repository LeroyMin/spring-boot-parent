package com.weizhis.shiro.repository;

import com.weizhis.shiro.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by minlee on 2018/3/11.
 */
public interface SysUserRepository extends JpaRepository<SysUser, String> {
}
