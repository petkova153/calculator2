package com.sda.she_likes_java.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingPersonsName {
    public static void main(String[] args) {
        SortedPerson person1 = new SortedPerson("Kevin", 22);
        SortedPerson person2 = new SortedPerson("Gwenn", 35);
        List<SortedPerson> listPerson = new ArrayList<>();
        listPerson.add(person1);
        listPerson.add(person2);

        Collections.sort(listPerson);
        //if the method return 1 pers2 should go after pers1
        person1.compareTo(person2);
        System.out.println(listPerson);
    }
}
