package cn.weizhis.module.user.service.impl;

import cn.weizhis.common.exception.BizzException;
import cn.weizhis.module.login.dto.UserInfoDTO;
import cn.weizhis.module.user.entity.UserInfo;
import cn.weizhis.module.user.repository.UserInfoRepository;
import cn.weizhis.module.user.service.UserService;
import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by minlee on 2018/4/15.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    private static Logger LOG = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserInfoRepository userInfoRepository;

    /**
     * 新增用户
     * @param userInfoDTO
     * @return
     * @throws BizzException
     */
    @Override
    public String addUser(UserInfoDTO userInfoDTO) throws BizzException {
        UserInfo result = null;
        try {
            UserInfo userInfo = new UserInfo();
            BeanUtils.copyProperties(userInfo, userInfoDTO);
            result = userInfoRepository.save(userInfo);
        }catch (Exception e) {
            LOG.error("保存用户信息失败,错误信息:{}",e);
            throw new BizzException("保存用户信息失败");
        }
        return result.getId();
    }

    /**
     * 编辑用户信息
     * @param userInfoDTO
     * @return
     * @throws BizzException
     */
    @Override
    public String editUserById(UserInfoDTO userInfoDTO) throws BizzException{
        UserInfoDTO queryRes = queryUserInfoById(userInfoDTO);
        if (queryRes == null || queryRes.getState() == 0){
            throw new BizzException("用户不存在或用户状态异常");
        }
        UserInfo userInfo = new UserInfo();
        try {
            BeanUtils.copyProperties(queryRes, userInfoDTO);
            BeanUtils.copyProperties(userInfo, queryRes);
            userInfo = userInfoRepository.saveAndFlush(userInfo);
        }catch (Exception e) {
            LOG.error("更新用户信息失败,错误信息:{}",e);
            throw new BizzException("更新用户信息失败");
        }
        return userInfo.getId();
    }

    @Override
    public void deleteUserById(UserInfoDTO userInfoDTO) throws BizzException{
        if(!userInfoRepository.exists(userInfoDTO.getId())){
            throw new BizzException("用户不存在,无法删除");
        }
        userInfoRepository.delete(userInfoDTO.getId());
    }

    @Override
    public UserInfoDTO queryUserInfoById(UserInfoDTO userInfoDTO) {
        try {
            UserInfo result = userInfoRepository.findOne(userInfoDTO.getId());
            BeanUtils.copyProperties(userInfoDTO, result);
        }catch (Exception e){

        }
        return userInfoDTO;
    }

    @Override
    public UserInfoDTO queryUserInfoByName(UserInfoDTO userInfoDTO) {
        return null;
    }

    @Override
    public List<UserInfoDTO> pageQueryUsers() {
        return null;
    }
}
