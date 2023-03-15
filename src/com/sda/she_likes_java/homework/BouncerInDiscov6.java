package com.sda.she_likes_java.homework;


import java.util.Scanner;

public class BouncerInDiscov6 {
    public static void main(String[] args) {
        int age;
        double height;
        boolean canSing;
        int outcomeFirst;
        Scanner sc;
        System.out.println("One day you decided to go to a karaoke night in the nearby club.\n");
        System.out.println("All they needed to know in order to let you in is:" +
                "1. your age\n" +
                "2. your height\n" +
                "3. singing abilities");
        sc = new Scanner(System.in);
        System.out.println("Tell me your age");
        age = sc.nextInt();
        System.out.println("Tell me your height in meters");
        height = sc.nextDouble();
        System.out.println("Tell me if you can sing");
        canSing = sc.nextBoolean();
        outcomeFirst = checkYoungBouncer(age,height,canSing);
        if (outcomeFirst == 1)
        {
            System.out.println("You can't enter. Better luck next time.");
            checkOldBouncer(age,height,canSing);
            System.out.println("\nYou try your luck with the older bouncer.\n");
        }
        else
            System.out.println("You are welcome");

    }
    public static int checkYoungBouncer(int age, double height, boolean canSing)
    {
        if (age >= 18 && height >= 1.75 && canSing)
            return (0);
        else
            return(1);
    }
    public static void checkOldBouncer(int age, double height, boolean canSing)
    {
        System.out.println("You restate your age:" + age + ", height: " + height + "ability to sing: " + canSing);
        if (age >= 18 || height >= 1.75 || canSing)
        {
            System.out.println("Come in my child.");
        }
        else
        {
            System.out.println("You can't fool the old fox.");
        }
    }
}
