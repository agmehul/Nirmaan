package com.nirmaan_bits.nirmaan;

public class Blog {

    private String title;
    private String desc;
    private String image;

    public Blog(String title, String desc, String image) {
        this.title = title;
        this.desc = desc;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDesc() {
        return desc;
    }

    public String getImage() {
        return image;
    }
    public Blog(){}


}
