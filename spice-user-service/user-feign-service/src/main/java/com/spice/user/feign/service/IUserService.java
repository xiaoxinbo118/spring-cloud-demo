package com.spice.user.feign.service;

import com.spice.user.entity.UserEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by sfht on 14/2/2019.
 */
@FeignClient(value = "user-service")
public interface IUserService {
    @RequestMapping(value = "/hi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/getUserInfo")
    UserEntity getUserInfo(@RequestParam(value = "_uid") long _uid);
}