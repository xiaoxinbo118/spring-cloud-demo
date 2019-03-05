package com.spice.user.dao;

import com.spice.user.SpiceException;
import com.spice.user.domain.UserDomain;
import com.spice.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by sfht on 5/3/2019.
 */
@Service
public class UserDao {
    @Autowired
    UserMapper userMapper;

    public UserDomain getUserInfo(long id) throws SpiceException {
        UserDomain userDomain = userMapper.selectByPrimaryKey(new Long(id));

        if (userDomain == null) {
            throw new SpiceException(10001, "无用户信息");
        }

        return userDomain;
    }

    public UserDomain selectByTelAndPsd(String telephone, String password) throws SpiceException {
        Example example = new Example(UserDomain.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo(UserDomain.COLUMN_CONDITION_TELEPHONE, telephone);
        criteria.andEqualTo(UserDomain.COLUMN_CONDITION_PASSWORD, password);
        criteria.andEqualTo("isDelete", 0);
        List<UserDomain> users = userMapper.selectByExample(example);
        UserDomain result = null;

        if (users.size() == 0) {
            throw new SpiceException(10002, "用户名或密码错误");
        }

        return users.get(0);
    }
}
