package com.sda.she_likes_java.exceptions;

public class BankExample {
    public static void main(String[] args) {
        BankConnector connector = new BankConnector();

        int money = 0;
        try{
            money = connector.BankBalance();
            System.out.println("this is the try " + money);
        }
        catch (Exception e){
            System.out.println("oopsie!");
        }
    }
}
