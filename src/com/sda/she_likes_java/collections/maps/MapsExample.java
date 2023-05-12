package com.sda.she_likes_java.collections.maps;

import com.sda.she_likes_java.collections.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapsExample {
    public static void main(String[] args) {
        long grade = -1;
        Long longGrade = 1l;
        longGrade = null;

        String name = null;

        List<Long> numbers;

        //map of students and their grades
        Map<String, List<Long>> studentGrades = new HashMap<>();
        String John = "John";
        List<Long> johnsGrades = new ArrayList<>();
        johnsGrades.add(5L);
        johnsGrades.add(1L);

        List<Long> anotherListOfGrades = new ArrayList<>();
        anotherListOfGrades.add(3L);

        studentGrades.put(John, johnsGrades);
        studentGrades.put(John, anotherListOfGrades);

        Person me = new Person("John", "Dow");
        me = new Person("Forest", "Gump");
        System.out.println("after adding John to map: " + studentGrades);
        studentGrades.put(John, anotherListOfGrades);
        System.out.println("after reassigning John inside map: " + studentGrades);
//        studentsGrades.put("mariusz", "2L");


        Map<String, String> namesAndSurnames = new HashMap<>();
        namesAndSurnames.put("Ramune", "LTU");

        System.out.println("Ramune's surname: " + namesAndSurnames.get("Ramune"));
    }

}
