package com.sda.she_likes_java.homework;

import java.util.Arrays;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random randGenerator;
        int[] generatedNumbers;
        int i;

        randGenerator = new Random();
        generatedNumbers = new int[3];
        for (i = 0; i < generatedNumbers.length; i++)
        {
            generatedNumbers[i] = randGenerator.nextInt();
        }
        System.out.println("The unsorted numbers are: " + Arrays.toString(generatedNumbers));
        Arrays.sort(generatedNumbers);
        System.out.println("The numbers after arranging them are: " + Arrays.toString(generatedNumbers));

    }
}
