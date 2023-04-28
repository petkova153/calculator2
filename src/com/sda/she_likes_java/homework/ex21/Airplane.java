package com.sda.she_likes_java.homework.ex21;

public class Airplane extends Vehicle implements Flying {
    @Override
    public void fly() {
        System.out.println("the airplane is flying");
    }
}
