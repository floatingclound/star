package com.powernode.pojo;

public class Product {
    // 列编辑模式：Alt + 鼠标左键拖拽
    // 格式化快捷键：Ctrl + Alt + L
    private String id;
    private String name;
    private String tid;
    private String price;
    private String num;
    private String imgurl;
    private String description;

    public Product() {
    }

    public Product(String id, String name, String tid, String price, String num, String imgurl, String description) {
        this.id = id;
        this.name = name;
        this.tid = tid;
        this.price = price;
        this.num = num;
        this.imgurl = imgurl;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", tid='" + tid + '\'' +
                ", price='" + price + '\'' +
                ", num='" + num + '\'' +
                ", imgurl='" + imgurl + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
