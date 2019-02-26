package com.spice.pim.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sfht on 25/2/2019.
 */
@RestController
public class DimController {
    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public UserEntity home() {
        UserEntity user =  new UserEntity();
        user.setName(port);
        return user;
    }

}
