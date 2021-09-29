package com.yunmi.controller;

import com.alibaba.fastjson.JSONArray;
import com.yunmi.dao.entity.UserDO;
import com.yunmi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @RequestMapping(value = "setPrivilege", method = RequestMethod.POST)
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
    @RequestMapping(value = "queryAllUsers")
    public String queryUsers() {
        return MessageSender.getSuccessMessage(JSONArray.toJSONString(userService.queryALL()));
    }
    @RequestMapping(value = "bindWxOpenId", method = RequestMethod.POST)
    public String bindWxOpenId(String wxOpenId, String phoneNum) {
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
    @RequestMapping(value = "setNickname", method = RequestMethod.POST)
    public String setNickname(String phoneNum, String nickName) {
        UserDO userDO = userService.getUserByPhoneNum(phoneNum);
        if (null == userDO) {
            return MessageSender.getNoSuchUserMessage();
        } else {
            UserDO returnObj = userService.setNickName(phoneNum,nickName);
            if (null == returnObj) {
                return MessageSender.errorMessage("set nickName error!");
            } else {
                return MessageSender.getSuccessMessage(JSONArray.toJSONString(returnObj));
            }
        }
    }
    @RequestMapping(value = "deleteUser",method = RequestMethod.POST)
    public String deleteUser(String phoneNum) {
        if (null == phoneNum) {
            return MessageSender.errorMessage("phoneNum is error");
        }
        UserDO userDO = userService.deleteUserByPhoneNum(phoneNum);
        if (null == userDO) {
            return MessageSender.getNoSuchUserMessage();
        } else {
            return MessageSender.getSuccessMessage(JSONArray.toJSONString(userDO));
        }
    }

}
