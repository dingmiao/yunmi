package com.yunmi.dao.DO;

public class ItemDO {
    private Integer itemId;
    private String title;
    private String info;
    private Double price;
    private String pictureURL;
    private String jumpURL;
    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPictureURL() {
        return pictureURL;
    }

    public void setPictureURL(String pictureURL) {
        this.pictureURL = pictureURL;
    }

    public String getJumpURL() {
        return jumpURL;
    }

    public void setJumpURL(String jumpURL) {
        this.jumpURL = jumpURL;
    }
}
