package com.sda.she_likes_java.homework;

import java.util.Random;
import java.util.Scanner;

public class BouncersWithWhileAndRandom {
    public static void main(String[] args) {
        Scanner inputField;
        Random randomNr;
        int isInTheClub;
        int age;
        int height;
        int rand;

        System.out.println("You decide to go to karaoke night in the nearby club.");
        System.out.println("In order to get in you need to answer 3 questions about yourself.\n");
        inputField = new Scanner(System.in);
        randomNr = new Random();
        do
        {
            System.out.println("How old are you?\n");
            age = inputField.nextInt();
            System.out.println("And how tall are you in cm?\n");
            height = inputField.nextInt();
            rand = randomNr.nextInt();
            if (rand % 3 > 0)
            {
                isInTheClub = YoungBouncer(age, height, inputField);
            }
            else
            {
                isInTheClub = OldBouncer(age, height, inputField);
            }
        } while (isInTheClub == 0);
    }
    public static int YoungBouncer(int age, int height, Scanner inputField)
    {
        boolean canSing;
        System.out.println("You got to the strict young bouncer.\n");
        if (age >= 18 && height >= 175)
        {
            System.out.println("Can you even sing?\n");
            canSing = inputField.nextBoolean();
            if (canSing)
            {
                System.out.println("Please enter and enjoy!");
                return (1);
            }
        }
        System.out.println("Go home and better luck next time");
        return (0);
    }
    public static int OldBouncer(int age, int height, Scanner inputField)
    {
        boolean canSing;
        System.out.println("Lucky you! You ended up at the old bouncer.\n");
        System.out.println("Can you even sing?\n");
        canSing = inputField.nextBoolean();
        if (age >= 18 || height >= 175 || canSing)
        {
                System.out.println("Please enter and enjoy, my child!");
                return (1);
        }
        System.out.println("Go home and better luck next time. Time to focus on your studies.");
        return (0);

    }
}
