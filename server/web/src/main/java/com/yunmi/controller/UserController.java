package com.yunmi.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.yunmi.dao.DO.UserDO;
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

    @RequestMapping(value = "getAllUserInfo",method = RequestMethod.GET)
    public String getAllUserInfoByPhoneNum(String phoneNum) {
        Map<String,String> resultMap = new HashMap<>(10);
        String checkString = preCheckPhoneNum(phoneNum);
        if (!"".equals(checkString)) {
            return checkString;
        }
        UserDO user = userService.getUserByPhoneNum(phoneNum);
        checkString = afterCheckPhoneNum(user);
        if (!"".equals(checkString)) {
            return checkString;
        }
        resultMap.put("code", "200");
        resultMap.put("message", "success");
        resultMap.put("data", JSONArray.toJSONString(user));
        return JSON.toJSONString(resultMap);
    }

    @RequestMapping(value = "setPrivilege", method = RequestMethod.GET)
    public String setPrivilegeByPhoneNum(String phoneNum, Integer exLevel) {
        Map<String,String> resultMap = new HashMap<>(10);
        String checkString = preCheckPhoneNum(phoneNum);
        if (!"".equals(checkString)) {
            return checkString;
        }
        UserDO user = userService.getUserByPhoneNum(phoneNum);
        checkString = afterCheckPhoneNum(user);
        if (!"".equals(checkString)) {
            return checkString;
        }
        userService.setExlevel(user, exLevel);
        resultMap.put("code", "200");
        resultMap.put("message", "success");
        return JSON.toJSONString(resultMap);
    }

    private String preCheckPhoneNum(String phoneNum) {
        Map<String,String> resultMap = new HashMap<>(10);
        if (null == phoneNum || phoneNum.length() != 11) {
            resultMap.put("code","400");
            resultMap.put("message","request error");
            resultMap.put("data", "null");
            return JSON.toJSONString(resultMap);
        }
        return "";
    }
    private String afterCheckPhoneNum(UserDO user) {
        if (null == user) {
            Map<String,String> resultMap = new HashMap<>(10);
            resultMap.put("code","404");
            resultMap.put("message","not such user");
            resultMap.put("data", "null");
            return JSON.toJSONString(resultMap);
        }
        return "";
    }
}
