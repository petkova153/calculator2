package com.sda.she_likes_java.homework.ex21;

public class Ship extends Vehicle implements Swimming {
    @Override
    public void swim() {
        System.out.println("the boat is swimming");
    }
}
