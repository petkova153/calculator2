package com.sda.she_likes_java.collections.lists;

import com.sda.she_likes_java.collections.Person;

import java.util.ArrayList;
import java.util.List;

public class ListEx2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Random");
        names.add("Bird");
        names.add("Bella");
        names.add(2, "Bella D.");

        PrintNames(names);
        printOnlySomeNames(names);
        addName(names);
        PrintNames(names);
    }
    public static void PrintNames(List<String> namePrints){
        System.out.println(namePrints);
    }

    public static void printOnlySomeNames(List<String> names) {
        // starting from position number 1 - second item
        for (int index = 1; index < names.size() - 1; index++) {
            System.out.println("name is: " + names.get(index));
        }
    }
//add name
    public static void addName(List<String> names){
        names.add("BoomBoom");
    }

    public static List<Person> findPersonsByName(List<Person> persons, String nameToFind){
        return null;
    }
}
