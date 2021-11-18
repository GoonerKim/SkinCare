package com.example.skincare.datas;

public class Nose {

    private String img;
    private String title;
    private String content;
    private String care;

    public Nose(String img, String title, String content, String care) {
        this.img = img;
        this.title = title;
        this.content = content;
        this.care = care;
    }

    public String getImg() {
        return img;
    }

    public String getTitle() { return title; }

    public String getContent() {
        return content;
    }

    public String getCare() { return care; }

}
