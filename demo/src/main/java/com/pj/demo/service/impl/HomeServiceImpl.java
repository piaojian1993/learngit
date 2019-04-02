package com.pj.demo.service.impl;

import com.pj.demo.mapper.UserMapper;
import com.pj.demo.pojo.User;
import com.pj.demo.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HomeServiceImpl implements HomeService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUserById(Integer id) {
        return userMapper.selectUserById(id);
    }


    @Override
    public int addNewUser() throws Exception{
        User user1 = new User();
        user1.setUsername("user1");
        user1.setName("用户1");

        userMapper.addNewUser(user1);

        int i = 1 / 0;

        User user2 = new User();
        user2.setUsername("user2");
        user2.setName("用户2");

        userMapper.addNewUser(user2);
        return 0;
    }
}
