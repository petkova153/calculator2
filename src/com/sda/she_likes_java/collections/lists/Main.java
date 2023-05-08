package com.sda.she_likes_java.collections.lists;

import com.sda.she_likes_java.collections.Pants;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        List<Pants> pantalones = new ArrayList<>();
        pantalones.add(new Pants("levis", "jeans"));
        pantalones.add(new Pants("big star", "jeans"));
        ShowItems(pantalones);
    }

    public static void ShowItems (List<Pants> items){
        //old way
        for (int i = 0;i < items.size(); i++  ){
            System.out.println("the items are " + items.get(i));
        }

        // same as above just use foreach
        for (Pants b: items
             ) {
            System.out.println(b);
        }
    }
}
