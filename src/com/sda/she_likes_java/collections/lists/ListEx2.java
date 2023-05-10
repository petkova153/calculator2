package com.sda.she_likes_java.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ListEx2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Random");
        names.add("Bird");
        names.add("Bella");
        PrintNames(names);

    }
    public static void PrintNames(List<String> namePrints){
        System.out.println(namePrints);
    }
}
