package com.sda.she_likes_java.objects_equality;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        System.out.println("is a and b equal " + (a == b));

        int c = 5;
        int h = 5;

        System.out.println("and these 2 are equal, right?" + (c==h));

        Person friend1 = new Person("Ben", "Jerry", 32);
        Person friend2 = new Person("Ben", "Jerry", 32);

        System.out.println("is it the same person? " + (friend1 == friend2));

        System.out.println("how about comparing them with equals: " + (friend1).equals(friend2));
    }
}
