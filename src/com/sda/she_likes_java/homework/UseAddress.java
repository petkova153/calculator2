package com.sda.she_likes_java.homework;

public class UseAddress {
    public static void main(String[] args) {
        Address myAddress;
        Address recipientAddress;

        myAddress = new Address();
        recipientAddress = new Address();

        myAddress.country = "Lithuania";
        myAddress.city = "Vilnius";
        myAddress.street = "Architektu";
        myAddress.postalCode = 4004;

        recipientAddress.country = "Bulgaria";
        recipientAddress.city = "Sofia";
        recipientAddress.street = "Torpedo";
        recipientAddress.postalCode = 1220;

        System.out.println("The address on the package I am sending will contain my address:\n" +
                myAddress.country + "\n"+
                myAddress.city + "\n" +
                myAddress.street + "\n"+
                myAddress.postalCode);

        System.out.println("And the recipient's address:\n" +
                recipientAddress.country + "\n"+
                recipientAddress.city + "\n" +
                recipientAddress.street + "\n"+
                recipientAddress.postalCode);
    }
}
