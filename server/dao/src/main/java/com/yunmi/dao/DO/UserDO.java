package com.yunmi.dao.DO;

public class UserDO {

    private Integer userId;
    private String phoneNum;
    private String password;
    private String wxOpenId;
    private ExLevel exLevel;
    private String nickName;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWxOpenId() {
        return wxOpenId;
    }

    public void setWxOpenId(String wxOpenId) {
        this.wxOpenId = wxOpenId;
    }

    public ExLevel getExLevel() {
        return exLevel;
    }

    public void setExLevel(ExLevel exLevel) {
        this.exLevel = exLevel;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    private String emailAdress;
    public enum ExLevel {NORMAL, SURPER, VIPUSER}

}
