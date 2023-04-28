package com.sda.she_likes_java.common_behaviour.wrong;

public class Superman implements Flyable, AbleToSwim,Movable{
    @Override
    public void fly() {
        System.out.println("Superman can fly");
    }

    @Override
    public void swim() {
        System.out.println("he can even fly");
    }

    @Override
    public void go() {
        System.out.println("can even go");
    }
}
