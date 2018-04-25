package cn.weizhis.module.user.service;

import cn.weizhis.common.exception.BizzException;
import cn.weizhis.module.login.dto.UserInfoDTO;

import java.util.List;

/**
 * Created by minlee on 2018/4/15.
 */
public interface UserService {

    String addUser(UserInfoDTO userInfoDTO) throws BizzException;

    String editUserById(UserInfoDTO userInfoDTO) throws BizzException;

    void deleteUserById(UserInfoDTO userInfoDTO) throws BizzException;

    UserInfoDTO queryUserInfoById(UserInfoDTO userInfoDTO);

    UserInfoDTO queryUserInfoByName(UserInfoDTO userInfoDTO);

    List<UserInfoDTO> pageQueryUsers();
}
