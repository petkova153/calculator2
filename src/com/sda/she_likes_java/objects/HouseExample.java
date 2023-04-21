package com.sda.she_likes_java.objects;

public class HouseExample {
    public static void main(String[] args) {
        Home myhouse;
        myhouse  = new Home(3, 1);
        System.out.println("I have a house with " + myhouse.getNumberOfBathrooms() + " bathrooms");
        System.out.println("I need more bathrooms");
        myhouse.setNumberOfBathrooms(2);
        System.out.println("The number of bathrooms is now " + myhouse.getNumberOfBathrooms());

        System.out.println("=====================================");
        HouseOwner wife;
        HouseOwner husband;

        wife = new HouseOwner("Marry", myhouse);
        husband = new HouseOwner("Max", myhouse);
        wife.getHouse().setNumberOfBathrooms(3);
        System.out.println("The number of bathrooms now is " + myhouse.getNumberOfBathrooms());

        husband.getHouse().setNumberOfBathrooms(1);
        System.out.println("The number of bathrooms now is " + myhouse.getNumberOfBathrooms());

        System.out.println(wife);
        System.out.println(husband);
        myhouse = new Home(1,1);
        System.out.println(wife);
        System.out.println(husband);
        System.out.println("Wife gets a new house");
        wife.setHouse(myhouse);
        System.out.println(wife);
    }
}
