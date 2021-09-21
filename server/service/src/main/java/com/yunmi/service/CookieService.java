package com.yunmi.service;

import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@Service
public class CookieService {
    private final String COOKIE_NAME = "token";

    public Cookie getCookie(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        Cookie token = null;
        if (null != cookies && cookies.length > 0){
            for (Cookie cookie : cookies) {
                if (COOKIE_NAME.equals(cookie.getName())) {
                    token = cookie;
                    break;
                }
            }
        }
        return token;
    }
}
