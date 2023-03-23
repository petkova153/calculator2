package com.sda.she_likes_java.homework;

public class UseAddress {
    public static void main(String[] args) {
        Address myAddress;
        Address recipientAddress;
        String street;
        String country;

        myAddress = new Address();
        recipientAddress = new Address();

        myAddress.country = "Lithuania";
        myAddress.city = "Vilnius";
        myAddress.street = "Architektu";
        myAddress.postalCode = 4004;

        System.out.println("The address on the package I am sending will contain my address:\n" +
                myAddress.country + "\n"+
                myAddress.city + "\n" +
                myAddress.street + "\n"+
                myAddress.postalCode);

        System.out.println("And the recipient's address:\n" +
                myAddress.country + "\n"+
                myAddress.city + "\n" +
                myAddress.street + "\n"+
                myAddress.postalCode);
    }
}
