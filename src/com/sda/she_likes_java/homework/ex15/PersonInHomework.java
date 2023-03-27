package com.sda.she_likes_java.homework.ex15;

public class PersonInHomework {
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    String name;
    String surname;
    int age;
    String address;
}
