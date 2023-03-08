package com.sda.she_likes_java.primitive_data_types;

import java.util.Scanner;

public class ConditionalExpressions {
    public static void main(String[] args) {
        System.out.println("Conditionals");
        Scanner inputScanner;

        int age = 15;
        boolean isKid = age < 18;
        System.out.println("is kid " + isKid);
        inputScanner = new Scanner(System.in);
        System.out.println("Tell me your age");
        age = inputScanner.nextInt();
        if (age < 18)
            System.out.println("You are a kid.");
        else
            System.out.println("You are an adult.");
    }
}
