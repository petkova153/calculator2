package com.sda.she_likes_java.exceptions;

import com.sda.she_likes_java.homework.RandomNumbers;

import java.util.Random;

public class BankConnector {
    public int BankBalance() throws Exception {
        Random random = new Random();
        int balance = random.nextInt();

        if(balance % 2 == 0) {
            return 1000;
        }
        else{
            throw new Exception("An error has occurred");
        }
    }

}
