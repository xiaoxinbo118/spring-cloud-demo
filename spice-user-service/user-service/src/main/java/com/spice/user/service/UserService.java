package com.spice.user.service;

import com.spice.user.domain.UserDomain;
import com.spice.user.entity.UserEntity;
import com.spice.user.dao.UserDao;
import com.spice.user.SpiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sfht on 4/3/2019.
 */
@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public UserEntity getUserInfo(long id) throws SpiceException {
        return this.transferEntity(userDao.getUserInfo(id));
    }

    public UserEntity login(String telephone, String password) throws SpiceException {
        return this.transferEntity(userDao.selectByTelAndPsd(telephone, password));
    }

    private UserEntity transferEntity(UserDomain domain) {
        UserEntity entity = new UserEntity();

        entity.setId(domain.getId());
        entity.setTeamId(domain.getTeamId());

        if (domain.getTelephone() != null) {
            entity.setTelephone(domain.getTelephone());
        }

        if (domain.getName() != null) {
            entity.setName(domain.getName());
        }

        return entity;
    }
}
