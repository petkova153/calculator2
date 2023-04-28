package com.sda.she_likes_java.homework.ex21;

public class Main {
    public static void main(String[] args) {
        Vehicle ship = new Ship();
        ship.moves();
        ((Ship)ship).swim();
    }
}
