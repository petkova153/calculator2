package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class BouncerInDiscoV5 {
    public static void main(String[] args) {
        int age;
        double hight;
        boolean canSing;
        Scanner userInput;
        boolean youngBouncer;
        boolean oldBouncer;
        int attempt;


        userInput = new Scanner(System.in);

        System.out.println("Stop!\nTo let you in answer me those questions 3:\n");
        System.out.println("1. What is your age");
        age = userInput.nextInt();
        System.out.println("2. What is your hight in meters");
        hight = userInput.nextDouble();
        System.out.println("3. Can you sing?");
        canSing = userInput.hasNext();

        youngBouncer = (age >= 16 && hight >= 165 && canSing);
        oldBouncer = (age >= 16 || hight >= 165 || canSing);


        if (youngBouncer)
        {
            System.out.println("Welcome in! Please enjoy the event. :)");
        }
        else
        {
            System.out.println("You can't enter. Better luck next time.");
            System.out.println("Trying again with the old bouncer.");
            if (oldBouncer)
            {
                System.out.println("Welcome in my child!");
            }
            else
            {
                System.out.println("You can't fool the old fox.");
            }
        }
    }
}
