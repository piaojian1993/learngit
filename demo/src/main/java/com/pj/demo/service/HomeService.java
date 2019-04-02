package com.pj.demo.service;

import com.pj.demo.pojo.User;

public interface HomeService {

    User selectUserById(Integer id);

    int addNewUser() throws Exception;
}
