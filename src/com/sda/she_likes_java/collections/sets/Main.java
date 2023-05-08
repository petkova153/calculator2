package com.sda.she_likes_java.collections.sets;

import com.sda.she_likes_java.collections.Pants;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println("Set are designed for storing unique things/items");

        Set<Pants> uniqueTrousers = new HashSet<>();
        uniqueTrousers.add(new Pants("jeans", "big star"));
        uniqueTrousers.add(new Pants("jeans", "big star"));
        uniqueTrousers.add(new Pants("jeans", "big star"));
        uniqueTrousers.add(new Pants("jeans", "big star"));
        uniqueTrousers.add(new Pants("jeans", "big star"));
        uniqueTrousers.add(new Pants("jeans", "big star"));

        System.out.println("size of the set is: " + uniqueTrousers.size());
        System.out.println("set of my trousers: " + uniqueTrousers);

        List<Pants> trousersList = List.of(
                new Pants("jeans", "big star"),
                new Pants("jeans", "big star"),
                new Pants("jeans", "big star")
        );
        Set<Pants> anotherSet = new HashSet<>(trousersList);
        System.out.println("Let's check if my list had some duplicates...");
        System.out.println(trousersList.size() == anotherSet.size());

    }

}

