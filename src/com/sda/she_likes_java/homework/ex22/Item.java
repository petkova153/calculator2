package com.sda.she_likes_java.homework.ex22;

public class Item {
    String productName;
    String productClass;

    public Item(String productName, String productClass) {
        this.productName = productName;
        this.productClass = productClass;
    }

    @Override
    public String toString() {
        return "Item{" +
                "productName='" + productName + '\'' +
                ", productClass='" + productClass + '\'' +
                '}';
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductClass() {
        return productClass;
    }

    public void setProductClass(String productClass) {
        this.productClass = productClass;
    }

    public void itemReference (){
        System.out.println("I am an item with name and class");
    }
}
