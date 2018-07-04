package com.geny.user.service;

import com.geny.user.entity.UserInfo;

/**
 * @author shmilyahu
 * @date 2018/6/30 13:00
 */
public interface UserService {

    UserInfo findByOpenid(String openid);
}
