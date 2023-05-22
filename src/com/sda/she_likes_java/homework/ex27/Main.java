package com.sda.she_likes_java.homework.ex27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MyDate> datesToSort = new ArrayList<>();
        datesToSort.add(new MyDate(1986,12,5));
        datesToSort.add(new MyDate(1989,2,5));
        datesToSort.add(new MyDate(2021,12,5));
        datesToSort.add(new MyDate(1986,12,4));

        Collections.sort(datesToSort);
        System.out.println("My sorted list " + datesToSort);
    }
}
