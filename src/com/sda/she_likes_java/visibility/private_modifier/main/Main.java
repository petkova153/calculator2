package com.sda.she_likes_java.visibility.private_modifier.main;

import com.sda.she_likes_java.visibility.private_modifier.cars.Car;

public class Main {
    public static void main(String[] args) {
        Car funnyCar = new Car();

        funnyCar.model = "corola";
        funnyCar.colour = "pink";
    }
}
