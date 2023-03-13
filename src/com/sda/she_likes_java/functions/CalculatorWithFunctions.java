package com.sda.she_likes_java.functions;

public class CalculatorWithFunctions {
    public static void main(String[] args) {
        sum(4,5);
    }

    public static int sum(int x, int y)
    {
        int result;

        result = x + y;
        System.out.println("The sum is " + result);
        return (result);
    }
}
