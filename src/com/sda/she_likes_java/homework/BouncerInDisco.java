package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class BouncerInDisco {
    public static void main(String[] args) {
        int age;
        int hight;
        String color;
        Scanner userInput;

        userInput = new Scanner(System.in);

        System.out.println("Stop!\nTo let you free answer me those questions 3:\n");
        System.out.println("1. What is your hight");
        hight = userInput.nextInt();
        System.out.println("2. What is your age");
        age = userInput.nextInt();
        System.out.println("3. What is your favorite color");
        color = userInput.next();

        if (age < 18 && hight < 160) {
            System.out.println("Sorry buddy but you need to wait a few more years!");
        } else if (hight < 160 && age > 18 && color == "unicorn") {
            System.out.println("This is some wizardy game I see.");
        } else if (hight > 160 && age < 18) {
            System.out.println("You can't fool me.");
        } else
            System.out.println("You are good to go!");
    }
}
