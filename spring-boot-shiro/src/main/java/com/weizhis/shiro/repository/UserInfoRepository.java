package com.weizhis.shiro.repository;

import com.weizhis.shiro.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by minlee on 2018/3/11.
 */
public interface UserInfoRepository extends JpaRepository<UserInfo, String> {
}
