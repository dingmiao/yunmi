package com.yunmi.service;

import com.yunmi.dao.entity.UserDO;
import com.yunmi.dao.mapper.UserDOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDOMapper userDOMapper;

    public String test() {
        return "scusses";
    }

    public UserDO getUserByPhoneNum(String phoneNum) {
        UserDO userDO = new UserDO();
        userDO.setPhoneNum(phoneNum);
        return userDOMapper.queryUserDOLimit1(userDO);
    }
    public boolean setExlevel(UserDO userDO, Integer exLevel) {
        if (exLevel < 0 || exLevel > 3) {
            return false;
        }
        userDO.setExLevel(exLevel);
        userDOMapper.updateUserDO(userDO);
        return true;
    }

    public UserDO insertUserByPhone(String phoneNum, String password) {
        UserDO queryOption = getUserByPhoneNum(phoneNum);
        if (null == queryOption) {
            UserDO userDO = new UserDO();
            userDO.setPhoneNum(phoneNum);
            userDO.setPassword(password);
            if(userDOMapper.insertUserDO(userDO) == 1) {
                return userDO;
            }
        }
        return null;
    }
    public UserDO bindWxOpenId(String phoneNum, String wxOpenId) {
        UserDO userDO = getUserByPhoneNum(phoneNum);
        userDO.setWxOpenId(wxOpenId);
        int change = userDOMapper.updateUserDO(userDO);
        if (0 == change) {
            return null;
        } else {
            return userDO;
        }

    }
}
