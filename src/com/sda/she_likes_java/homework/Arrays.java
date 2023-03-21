package com.sda.she_likes_java.homework;

public class Arrays {
    public static void main(String[] args) {
        int i;
        int[] arrayOfIx3;

        arrayOfIx3 = new int[100];
        for (i = 0; i <= 99; i++)
        {
            arrayOfIx3[i] = i*3;
        }

        System.out.println("your array is:\n");
        System.out.println("with total length of " + arrayOfIx3.length);
        for (i = 0; i <= 99; i++)
        {
            System.out.println("index nr " + i + ": " + arrayOfIx3[i]);
        }
    }
}
