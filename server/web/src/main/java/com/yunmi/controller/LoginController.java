package com.yunmi.controller;

import com.yunmi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    UserService userService;
    @RequestMapping("1")
    public String f() {
        return userService.test();
    }

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String login(String phoneNum, String password) {
        return "";
    }
}
