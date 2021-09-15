package com.yunmi.controller;

import com.alibaba.fastjson.JSONArray;
import com.yunmi.dao.entity.UserDO;
import com.yunmi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "getUserInfo",method = RequestMethod.GET)
    public String getAllUserInfoByPhoneNum(String phoneNum) {
        if (null == phoneNum || phoneNum.length() != 11) {
            return MessageSender.getRequestErrorMessage();
        }
        UserDO user = userService.getUserByPhoneNum(phoneNum);
        if (null == user) {
            return MessageSender.getNoSuchUserMessage();
        }
        return MessageSender.getSuccessMessage(JSONArray.toJSONString(user));
    }

    @RequestMapping(value = "setPrivilege", method = RequestMethod.GET)
    public String setPrivilegeByPhoneNum(String phoneNum, Integer exLevel) {
        if (null == phoneNum || phoneNum.length() != 11) {
            return MessageSender.getRequestErrorMessage();
        }
        UserDO user = userService.getUserByPhoneNum(phoneNum);
        if (null == user) {
            return MessageSender.getNoSuchUserMessage();
        }
        userService.setExlevel(user, exLevel);
        return MessageSender.getSuccessMessage(JSONArray.toJSONString(user));
    }

}
