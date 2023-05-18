package com.sda.she_likes_java.sorting;

import java.util.Arrays;

public class SimpleArraySorting {


    public static void main(String[] args) {
        int [] numbers = new int [4];
        int [] numbers2 = {8,1,4,6};
        Object arrayNumbers = numbers2;
        System.out.println(numbers2.length);
        Arrays.sort(numbers2);
        System.out.println(numbers2);
        System.out.println(Arrays.toString(numbers2));
        //Arrays
        //Collections
    }
}
