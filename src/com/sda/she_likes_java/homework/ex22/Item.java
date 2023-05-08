package com.sda.she_likes_java.homework.ex22;

import java.util.Objects;

public class Item {
    String productName;
    String productClass;
    double priceEUR;

    public Item(String productName, String productClass, double priceEUR) {
        this.productName = productName;
        this.productClass = productClass;
        this.priceEUR = priceEUR;
    }

    @Override
    public String toString() {
        return "Item{" +
                "productName='" + productName + '\'' +
                ", productClass='" + productClass + '\'' +
                ", priceEUR=" + priceEUR +
                '}';
    }

    public String getProductName() {
        return productName;
    }

    public String getProductClass() {
        return productClass;
    }

    public double getPriceEUR() {
        return priceEUR;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Double.compare(item.priceEUR, priceEUR) == 0 && Objects.equals(productName, item.productName) && Objects.equals(productClass, item.productClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productClass, priceEUR);
    }

    public void itemReference (){
        System.out.println("I am an item with name and class");
    }
}
