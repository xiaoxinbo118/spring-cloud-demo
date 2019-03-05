package com.spice.user.service;

import com.spice.user.domain.UserDomain;
import com.spice.user.entity.UserEntity;
import com.spice.user.mapper.UserMapper;
import com.spice.user.result.SpiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sfht on 4/3/2019.
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public UserEntity getUserInfo(long id) throws SpiceException {
        UserDomain userDomain = userMapper.selectByPrimaryKey(new Long(id));

        if (userDomain == null) {
            throw new SpiceException(10001, "无用户信息");
        }

        UserEntity userEntity = new UserEntity();
        userEntity.setId(id);
        userEntity.setName(userDomain.getName());
        return userEntity;
    }
}
