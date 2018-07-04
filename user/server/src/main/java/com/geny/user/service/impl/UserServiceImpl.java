package com.geny.user.service.impl;

import com.geny.user.entity.UserInfo;
import com.geny.user.repository.UserInfoRepository;
import com.geny.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shmilyahu
 * @date 2018/6/30 13:02
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Override
    public UserInfo findByOpenid(String openid) {
        return userInfoRepository.findByOpenid(openid);
    }
}
