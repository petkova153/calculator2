package com.sda.she_likes_java.collections.maps;

import com.sda.she_likes_java.collections.Pants;
import com.sda.she_likes_java.collections.Person;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Maps are like dictionaries");
        Map<String, Pants> myPants = new HashMap<>();
        myPants.put("best", new Pants("hm", "cotton"));
        myPants.put("worst", new Pants("unknown", "stretchy"));

//pants that belong to a person
        Map<Person, Pants> personPants = new HashMap<>();
        personPants.put(new Person("Best", "Friend"), new Pants("decent","cotton"));
    }
}
