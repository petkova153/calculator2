package com.sda.she_likes_java.homework.ex15;

import com.sda.she_likes_java.homework.Address;

public class Parent {
    /*Create a Parent class containing the following variables:
- first name
- surname
- address - (use the class Address)
- firstChild (use class Person)
- secondChild (use class Person)*/
    String first_name;
    String surname;
    Address parents_address;
    PersonInHomework firstChild;
    PersonInHomework secondChild;

    public static void main(String[] args) {
        Parent myname;
        com.sda.she_likes_java.homework.ex15.Address myadress;

        myname = new Parent();
        myname.first_name = "Aleksandra";
        myadress = new com.sda.she_likes_java.homework.ex15.Address();
        myadress.country = "Lithuania";
        System.out.println("My name is %s and I live in %s".formatted(myname.first_name, myadress.country));

    }
}
