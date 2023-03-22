package com.sda.she_likes_java.classes;

public class PersonExample {
    public static void main(String[] args) {
        System.out.println("Let's use our newly created class Person");

        Person me;
        Person you;
        me = new Person();
        you = new Person();

        me.name = "Aleksandra";
        you.name = "Ylva";
        System.out.println("My name is " + me.name +
                " and your name is " + you.name);
    }
}
