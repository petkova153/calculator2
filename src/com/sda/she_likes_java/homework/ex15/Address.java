package com.sda.she_likes_java.homework.ex15;

public class Address {
    String country;
    String city;
    String street;
    int postalCode;

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", postalCode=" + postalCode +
                '}';
    }
}
