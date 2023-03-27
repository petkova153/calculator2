package com.sda.she_likes_java.objects;

public class Dog {
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    String name;
    public static void main(String[] args) {
        Dog dogname;
        dogname = new Dog();
        dogname.name = "Sharo";

        System.out.println("My dog name is " + dogname);
    }
}
