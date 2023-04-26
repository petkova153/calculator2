package com.sda.she_likes_java.common_behaviour.wrong;

import kotlin.properties.ObservableProperty;

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
        //we cast Abletoswim to sherchas since sherchas is an Animal and Animal can't swim
        AbleToSwim scherchas2 = (AbleToSwim) sherchas;
        scherchas2.swim();
        Object objectTiger = new Tiger();
        // cannot call go() and swim() - they are not visible here
    }
}
