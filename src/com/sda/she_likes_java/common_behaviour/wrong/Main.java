package com.sda.she_likes_java.common_behaviour.wrong;

public class Main {
    public static void main(String[] args) {
        Bird pigeon = new Bird();
//        pigeon.fly();
        Animal sherchas = new Tiger();
        sherchas.go();
        Bird commonParrot = new Parrot();
        Flyable fParrot = new Parrot();
        commonParrot.go();
        fParrot.fly();
    }
}
