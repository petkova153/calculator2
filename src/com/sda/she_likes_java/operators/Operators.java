package com.sda.she_likes_java.operators;

public class Operators {

    public static void main(String[] args) {
        System.out.println("Now, let's try some operators");
        System.out.println("Logical operators");

        boolean firstValue;
        boolean secondValue;
        boolean evaluationResult;
        System.out.println("&& operator");
        firstValue = true;
        secondValue = true;
        evaluationResult = firstValue && secondValue;
        System.out.println("true && true: " + evaluationResult);

        firstValue = true;
        secondValue = false;
        evaluationResult = firstValue && secondValue;
        System.out.println("true && false: " + evaluationResult);

        firstValue = false;
        secondValue = true;
        evaluationResult = firstValue && secondValue;
        System.out.println("false && true: " + evaluationResult);

        firstValue = false;
        secondValue = false;
        evaluationResult = firstValue && secondValue;
        System.out.println("false && false: " + evaluationResult);
    }
}