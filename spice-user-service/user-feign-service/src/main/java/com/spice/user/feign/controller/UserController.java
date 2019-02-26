package com.spice.user.feign.controller;

import com.spice.user.entity.UserEntity;
import com.spice.user.feign.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sfht on 20/2/2019.
 */
@RestController
public class UserController {
    @Autowired
    IUserService userService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return userService.sayHiFromClientOne( name ) + "feign";
    }

    @RequestMapping("/getUserInfo")
    public UserEntity getUserInfo(@RequestParam long _uid) {
        return userService.getUserInfo(_uid);
    }
}
