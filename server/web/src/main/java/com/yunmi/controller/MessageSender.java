package com.yunmi.controller;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

public class MessageSender {
    public static String getSuccessMessage(String data) {
        Map<String,String> resultMap = new HashMap<>(10);
        resultMap.put("code", "200");
        resultMap.put("message", "success");
        resultMap.put("data", data);
        return JSON.toJSONString(resultMap);
    }
    public static String getNoSuchUserMessage() {
        Map<String,String> resultMap = new HashMap<>(10);
        resultMap.put("code","404");
        resultMap.put("message","not such user");
        resultMap.put("data", "null");
        return JSON.toJSONString(resultMap);
    }
    public static String getNoSuchThingMessage() {
        Map<String,String> resultMap = new HashMap<>(10);
        resultMap.put("code","404");
        resultMap.put("message","not such thing");
        resultMap.put("data", "null");
        return JSON.toJSONString(resultMap);
    }
    public static String getRequestErrorMessage() {
        Map<String,String> resultMap = new HashMap<>(10);
        resultMap.put("code","400");
        resultMap.put("message","request error");
        resultMap.put("data", "null");
        return JSON.toJSONString(resultMap);
    }
    public static String errorMessage(String data) {
        Map<String,String> resultMap = new HashMap<>(10);
        resultMap.put("code", "500");
        resultMap.put("message", "process error");
        resultMap.put("data", data);
        return JSON.toJSONString(resultMap);
    }
}
