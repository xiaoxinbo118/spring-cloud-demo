package com.spice.user.controller;

import com.spice.user.dao.UserDao;
import com.spice.user.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by sfht on 14/2/2019.
 */
@RestController
public class UserController {
    @Autowired
    UserDao userDao;

    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public UserEntity home() {
        UserEntity user =  new UserEntity();
        user.setName(port);
        return user;
    }

    @RequestMapping("/getUserInfo")
    public UserEntity getUserInfo(@RequestParam long _uid) {
        return userDao.getUserInfo(_uid);
    }

    @RequestMapping("/saveUserInfo")
    public boolean saveUserInfo(HttpServletRequest request, UserEntity userInfo) {
        return userDao.saveUserInfo(userInfo);
    }
}
