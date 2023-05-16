package com.sda.she_likes_java.homework.ex25;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Cities_Countries {
    private final Map<String, String> cityCountry;
    public Cities_Countries() {
        cityCountry = new HashMap<>();
        cityCountry.put("Sofia", "Bulgaria");
        cityCountry.put("Vilnius", "Lithuania");
        cityCountry.put("Warsaw", "Poland");
        cityCountry.put("Ryga", "Latvia");
        cityCountry.put("Stockholm", "Sweden");
    }

    public void addCityCountryCombo(String city, String country){
        cityCountry.put(city,country);
    }
    public String CountryByCity (String searchWord){
        String theCityReturned;
        for(Entry<String, String> entry: cityCountry.entrySet()) {

            // if give value is equal to value from entry
            // print the corresponding key
            if (entry.getValue() == searchWord) {
                System.out.println("The key for value " + searchWord + " is " + entry.getKey());
                theCityReturned = entry.getKey();
                return theCityReturned;
            }
        }
        return null;
    }
}
