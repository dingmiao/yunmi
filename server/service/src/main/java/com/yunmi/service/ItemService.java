package com.yunmi.service;

import com.yunmi.dao.entity.ItemDO;
import com.yunmi.dao.mapper.ItemDOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemDOMapper itemDOMapper;

    public ItemDO addItem(String title, Double price, String info) {
        ItemDO itemDO = queryItemByTitle(title);
        if (null != itemDO) {
            return null;
        } else {
            ItemDO newItem = new ItemDO();
            newItem.setTitle(title);
            newItem.setInfo(info);
            newItem.setPrice(price);
            itemDOMapper.insertItemDO(newItem);
            return newItem;
        }
    }

    public ItemDO queryItemByTitle(String title) {
        ItemDO itemDO = new ItemDO();
        itemDO.setTitle(title);
        ItemDO queryResult = itemDOMapper.queryItemDOLimit1(itemDO);
        if (null == queryResult) {
            return null;
        } else {
            return queryResult;
        }
    }
    public boolean deleteItemByTitle(String title) {
        return itemDOMapper.deleteItemByTitle(title) == 1;
    }

    public ItemDO updateItem(String title, String picURL, String info, String jumpURL, Double price) {
        ItemDO itemDO = new ItemDO();
        itemDO.setPrice(price);
        itemDO.setInfo(info);
        itemDO.setJumpURL(jumpURL);
        itemDO.setTitle(title);
        itemDO.setPictureURL(picURL);
        itemDOMapper.updateItemDO(itemDO);
        return itemDO;
    }

    public List<ItemDO> queryAllItem() {
        return itemDOMapper.queryAll();
    }
}
