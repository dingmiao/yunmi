package com.yunmi.controller;

import com.alibaba.fastjson.JSONArray;
import com.yunmi.dao.entity.UserDO;
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
        return null;
    }

    @RequestMapping(value = "register",method = RequestMethod.POST)
    public String register(String phoneNum, String password) {
        UserDO userDO = userService.getUserByPhoneNum(phoneNum);
        if (null != userDO) {
            return MessageSender.getSuccessMessage("user already exist!");
        } else {
            UserDO newUser = userService.insertUserByPhone(phoneNum,password);
            return MessageSender.getSuccessMessage(JSONArray.toJSONString(newUser));
        }
    }
    @RequestMapping(value = "bindWxOpenId", method = RequestMethod.POST)
    public String bindWxOpenId (String wxOpenId, String phoneNum) {
        UserDO userDO = userService.getUserByPhoneNum(phoneNum);
        if (null == userDO) {
            return MessageSender.getNoSuchUserMessage();
        } else {
            UserDO returnObj = userService.bindWxOpenId(phoneNum, wxOpenId);
            if (null == returnObj) {
                return MessageSender.errorMessage("bind WxId Error");
            } else {
                return MessageSender.getSuccessMessage(JSONArray.toJSONString(returnObj));
            }
        }
    }

}
