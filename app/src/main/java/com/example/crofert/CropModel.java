package com.example.crofert;

public class CropModel {
    private int picture;
    private String name;
    private String desc;

    public CropModel(int picture, String name, String desc) {
        this.picture = picture;
        this.name = name;
        this.desc = desc;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
