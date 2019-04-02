package com.pj.demo;

import com.pj.demo.mapper.UserMapper;
import com.pj.demo.pojo.User;
import com.pj.demo.service.HomeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private HomeService homeService;

    @Test
    public void contextLoads() throws Exception{
//        User user = userMapper.selectUserById(1);
//        System.out.println(user);

        homeService.addNewUser();
    }

}

