package com.yunmi.service;

import com.yunmi.dao.DO.UserDO;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String test() {
        return "scusses";
    }

    public UserDO getUserByPhoneNum(String phoneNum) {
        return null;
    }
    public boolean setExlevel(UserDO userDO, Integer exLevel){
        return false;
    }
}
