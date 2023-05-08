package com.sda.she_likes_java.homework.ex22;

import java.util.ArrayList;
import java.util.List;

public class CartList {
    private List<Item> items;

    public void ShoppingCart(){
        this.items = new ArrayList<>();
    }

    public void AddItem (Item product){
        items.add(product);
    }

    public void ListCartItems() {
        System.out.println("The items in your basket are: " + items);
    }

}
