package com.sda.she_likes_java.controls;

import java.util.Scanner;

public class weekdaysWithIf {
    public static void main(String[] args) {
        int userInputDay;
        Scanner sc;

        sc = new Scanner(System.in);
        System.out.println("please enter a number between 1 and 7");
        userInputDay = sc.nextInt();

        switch (userInputDay) {
            case 1:
                System.out.println("It is monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Don't cheat!");
        }
    }
}
