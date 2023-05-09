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

        PrintMyJeans(myPants);
    }

    public static void PrintMyJeans(Map<String, Pants> pantsMap) {
        System.out.println("Check what is stored in the map");
        System.out.println(pantsMap.get("best"));
        System.out.println(pantsMap.get("worst"));

        // Map.Entry represent key + value at once
        for (Map.Entry<String, Pants> item : pantsMap.entrySet()) {
            System.out.println("Key: " + item.getKey());
            System.out.println("Value: " + item.getValue());
        }
    }
}
