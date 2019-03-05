package com.spice.user.mapper;

import com.spice.user.domain.UserDomain;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<UserDomain> {

//    UserDomain selectByTelAndPsd(@Param("telephone") String telephone,
//                           @Param("password") String password,
//                           @Param("is_delete") Integer is_delete);
}