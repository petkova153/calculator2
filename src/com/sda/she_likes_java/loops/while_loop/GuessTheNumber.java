package com.sda.she_likes_java.loops.while_loop;

import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random numberGenerator = new Random();
        int randomNr;
        randomNr = numberGenerator.nextInt();
        System.out.println("number is:" + randomNr);
    }
}
