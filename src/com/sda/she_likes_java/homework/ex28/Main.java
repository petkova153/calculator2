package com.sda.she_likes_java.homework.ex28;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Names> nameList = new ArrayList<>();
        nameList.add(new Names("Fred"));
        nameList.add(new Names("Barny"));
        nameList.add(new Names("Adam"));

        nameList.sort(new NameCompare());
        System.out.println(nameList);
    }
}
