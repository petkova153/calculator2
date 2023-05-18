package com.sda.she_likes_java.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSorting {
    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(5);
        numbersList.add(30);
        numbersList.add(-330);
        numbersList.add(465);

        Collections.sort(numbersList);
        System.out.println(numbersList);

    }
}
