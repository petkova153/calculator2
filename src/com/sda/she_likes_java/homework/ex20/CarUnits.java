package com.sda.she_likes_java.homework.ex20;

public class CarUnits {
    public static void Safecast(Car automobile){
        if (automobile instanceof Ferrari){
            System.out.println("This car is very fast, right?" + ((Ferrari)automobile).isFaster());
        }
        else if(automobile instanceof Toyota){
            System.out.println("This car is quite safe " + ((Toyota)automobile).isSafe());
        }
        else {
            System.out.println("This car is something else" );
        }
    }

}
