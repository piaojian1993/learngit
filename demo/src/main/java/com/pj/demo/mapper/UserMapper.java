package com.pj.demo.mapper;

import com.pj.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User selectUserById(Integer id);

    int addNewUser(User user);
}
