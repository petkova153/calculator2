package com.sda.she_likes_java.homework;
//packages use reverse domain names because they identify our files in global domain way
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc;
        double num1;
        double num2;
        char operator;

        System.out.println("Enter first number:");
        sc = new Scanner(System.in);
        num1 = sc.nextDouble();
        System.out.println("Enter second number:");
        num2 = sc.nextDouble();
        System.out.println("Please choose operator +,-,/,*");
        operator = sc.next().charAt(0);

        System.out.println("you chose " + operator);
        switch (operator) {
            case '+':
                System.out.println("The result is: " + (num1 + num2));
                break;
            case '-':
                System.out.println("The result is: " + (num1 - num2));
                break;
            case '*':
                System.out.println("The result is: " + (num1 * num2));
                break;
            case '/':
                System.out.println("The result is: " + (num1 / num2));
                break;
        }
    }
}