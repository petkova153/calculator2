package com.sda.she_likes_java.homework.ex20;

public class Main {
    public static void main(String[] args) {
        CarUnits.Safecast(new Volvo());
        CarUnits.Safecast(new Ferrari());
        System.out.println("now create just a car");
        Car f1 = new Ferrari();
        System.out.println("\n the new car is " + f1);
        f1.isDriving();
    }
}
