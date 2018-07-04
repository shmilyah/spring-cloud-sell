package com.geny.user.repository;

import com.geny.user.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author shmilyahu
 * @date 2018/6/30 12:58
 */
public interface UserInfoRepository extends JpaRepository<UserInfo, String> {


    UserInfo findByOpenid(String openid);
}
