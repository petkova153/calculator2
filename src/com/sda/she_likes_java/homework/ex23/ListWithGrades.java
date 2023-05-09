package com.sda.she_likes_java.homework.ex23;


import java.util.HashMap;
import java.util.Map;

public class ListWithGrades {
    public static void main(String[] args) {
        System.out.println("Let's see what kind of grades the pupils got on the exam");
        Map<Pupils, Subject> pupilGrades = new HashMap<>();
        pupilGrades.put(new Pupils("Ben","Aflek", 8),new Subject("Literature", 8.5));
        pupilGradePrint(pupilGrades);
    }

    public static void pupilGradePrint(Map<Pupils, Subject> pGrade){
        // Map.Entry represent key + value at once
        for (Map.Entry<Pupils, Subject> item : pGrade.entrySet()) {
            System.out.println("Key: " + item.getKey());
            System.out.println("Value: " + item.getValue());
        }
    }
}
