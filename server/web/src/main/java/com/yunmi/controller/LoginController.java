package com.yunmi.controller;

import com.alibaba.fastjson.JSONArray;
import com.yunmi.dao.entity.UserDO;
import com.yunmi.service.CookieService;
import com.yunmi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;
import java.util.concurrent.TimeUnit;


@RestController
public class LoginController {

    @Autowired
    private UserService userService;
    @Resource
    private RedisTemplate<String,String> redisTemplate;
    @Autowired
    private CookieService cookieService;

    private final String COOKIE_NAME = "token";

    @RequestMapping("1")
    public String f(HttpServletRequest request) {
        Cookie cookie = cookieService.getCookie(request);
        return MessageSender.getSuccessMessage("hhh");
    }
    @RequestMapping(value = "checkState", method = RequestMethod.GET)
    public String checkState(HttpServletRequest request) {
        Cookie token = cookieService.getCookie(request);
        if (null != token) {
            String user = redisTemplate.opsForValue().get(token.getValue());
            if (null != user) {
                return MessageSender.getSuccessMessage("user already login");
            }
        }
        return MessageSender.errorMessage("user is not login!");
    }
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String login(String phoneNum, String password, HttpServletRequest request, HttpServletResponse response) {
        UserDO userDO = userService.getUserByPhoneNum(phoneNum);
        if (null == userDO) {
            return MessageSender.getNoSuchUserMessage();
        }
        if (!password.equals(userDO.getPassword())) {
            return MessageSender.errorMessage("password is wrong!");
        }
        String uuid = UUID.randomUUID().toString().replace("-", "");
        response.addCookie(new Cookie(COOKIE_NAME,uuid));
        redisTemplate.opsForValue().set(uuid, phoneNum, 10, TimeUnit.MINUTES);
        return MessageSender.getSuccessMessage("login success!");
    }
    @RequestMapping(value = "logout", method = RequestMethod.GET)
    public String logout(HttpServletRequest request) {
        Cookie cookie = cookieService.getCookie(request);
        if (null == cookie) {
            return MessageSender.errorMessage("no such logined user!");
        }
        Boolean rst = redisTemplate.delete(cookie.getValue());
        if (null != rst && rst) {
            return MessageSender.getSuccessMessage("logout success!");
        } else {
            return MessageSender.errorMessage("no such logined user!");
        }
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

}
