package com.sda.she_likes_java.homework.ex25;

public class Main {
    public static void main(String[] args) {
        Cities_Countries comeCityCountryCombo = new Cities_Countries();
        String countryTest = "Bulgaria";
        System.out.println("The capital of Bulgaria is " + comeCityCountryCombo.CountryByCity(countryTest));
    }
}
