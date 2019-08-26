package com.example.mekpartner.cart;

public class MyListData{
    private String description;
    private int imgId;
    private int imgId1;

    public MyListData(String description, int imgId, int imgId1) {
        this.description = description;
        this.imgId = imgId;
        this.imgId1 = imgId1;

    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getImgId() {
        return imgId;
    }
    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
    public int getImgId1() {
        return imgId1;
    }
    public void setImgId1(int imgId1) {
        this.imgId1 = imgId1;
    }
}