package com.spice.user.dao;

import com.spice.user.entity.UserEntity;
import org.springframework.stereotype.Service;

/**
 * Created by sfht on 21/2/2019.
 */
@Service
public class UserDao {
    public UserEntity getUserInfo(long userId) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(userId);
        userEntity.setName("11");
//        userEntity.setTeamId(100 / 0);
//        throw new Exception("this is an error");
        return userEntity;
    }

    public boolean saveUserInfo(UserEntity entity) {
        if (entity == null) {
            return false;
        }
        return true;
    }
}
