package com.sda.she_likes_java.common_behaviour.wrong;

public class Penguin extends Bird implements AbleToSwim{
    @Override
    public void swim() {
        System.out.println("can swim");
    }
}
