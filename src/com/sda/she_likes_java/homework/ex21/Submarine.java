package com.sda.she_likes_java.homework.ex21;

public class Submarine extends Vehicle implements Diving{
    @Override
    public void dive() {
        System.out.println("the submarine is diving");
    }
}
