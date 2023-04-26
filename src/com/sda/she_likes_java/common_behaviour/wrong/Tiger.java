package com.sda.she_likes_java.common_behaviour.wrong;

public class Tiger extends Animal implements AbleToSwim{
    @Override
    public void go() {
        super.go();
    }

    @Override
    public void swim() {
        System.out.println("tigers can also swim");
    }
}
