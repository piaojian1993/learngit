package com.pj.demo.controller;


import com.pj.commonutil.DateUtil;
import com.pj.demo.mapper.UserMapper;
import com.pj.demo.pojo.User;
import com.pj.demo.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private HomeService homeService;

    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");

        User user = new User();
        user.setName("朴健");
        modelAndView.addObject("title",user);
        return modelAndView;
    }


    @RequestMapping("/user")
    @ResponseBody
    public User selectUserByid(Integer id) {
        return homeService.selectUserById(id);
    }

    @RequestMapping("/adduser")
    @ResponseBody
    public int adduser() throws Exception{
        String s = DateUtil.dateTimeToString(new Date());
        System.out.println(s);
        return homeService.addNewUser();
    }
}
