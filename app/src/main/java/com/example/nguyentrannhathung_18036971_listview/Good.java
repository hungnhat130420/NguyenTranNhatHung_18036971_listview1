package com.example.nguyentrannhathung_18036971_listview;

public class Good {
    private String name;
    private String price;
    private int imageGood;

    public Good(String name, String price, int imageGood) {
        this.name = name;
        this.price = price;
        this.imageGood = imageGood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImageGood() {
        return imageGood;
    }

    public void setImageGood(int imageGood) {
        this.imageGood = imageGood;
    }
}
