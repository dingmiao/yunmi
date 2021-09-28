package com.yunmi.controller;


import com.alibaba.fastjson.JSONArray;
import com.yunmi.dao.entity.ItemDO;
import com.yunmi.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "getAllItem", method = RequestMethod.GET)
    public String getAllItem(){
        return MessageSender.getSuccessMessage(JSONArray.toJSONString(itemService.queryAllItem()));
    }

    @RequestMapping(value = "getItemDetailByTitle", method = RequestMethod.POST)
    public String getItemDetialByTitle(String title) {
        if (null == title || title.length() == 0) {
            return MessageSender.errorMessage("bad request");
        }
        ItemDO itemDO = itemService.queryItemByTitle(title);
        if (null == itemDO) {
            return MessageSender.getNoSuchThingMessage();
        } else {
            return MessageSender.getSuccessMessage(JSONArray.toJSONString(itemDO));
        }
    }

    @RequestMapping(value = "addItem", method = RequestMethod.POST)
    public String addItem(String title, Double price, String info) {
        ItemDO itemDO = itemService.addItem(title,price,info);
        if (null == itemDO) {
            return MessageSender.errorMessage("item aleady exist");
        } else {
            return MessageSender.getSuccessMessage(JSONArray.toJSONString(itemDO));
        }
    }
    @RequestMapping(value = "deleteItemByName", method = RequestMethod.POST)
    public String deleteItem(String title) {
        if (null == title || title.length() == 0) {
            return MessageSender.errorMessage("bad request");
        }
        boolean rst = itemService.deleteItemByTitle(title);
        if (rst) {
            return MessageSender.getSuccessMessage("delete success!");
        } else {
            return MessageSender.errorMessage("delete error!");
        }
    }
    @RequestMapping(value = "updateItem", method = RequestMethod.POST)
    public String updateItem(String title, String picURL, String info, String jumpURL, Double price) {
        ItemDO itemDO = itemService.updateItem(title,picURL,info,jumpURL,price);
        return MessageSender.getSuccessMessage(JSONArray.toJSONString(itemDO));
    }

}
