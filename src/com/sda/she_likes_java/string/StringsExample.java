package com.sda.she_likes_java.string;

public class StringsExample {
    public static void main(String[] args) {
        String name;
        String surname;
        int age;

        name = "Aleksandra";
        surname = "Petkova";
        age = 36;
        System.out.println("Hi, my name is " + name + ". My surname is " + surname + " and I am " + age + " years old.");
        System.out.println(String.format("Hi, I'm %s %s. I am %d years old.",name, surname, age));
        System.out.println("Hi, I'm %s %s. I am %d old.".formatted(name, surname, age));
    }
}
