package com.sda.she_likes_java.operators;

public class inkv2 {
    public static void main(String[] args) {
        int age;
        boolean isAdult;
        age = 17;
        isAdult = age >= 18;
        System.out.println("is adoult " + isAdult);
        isAdult = age++ >= 18;
        System.out.println("age will be incremented after it is assigned " + age + isAdult);
    }
}
