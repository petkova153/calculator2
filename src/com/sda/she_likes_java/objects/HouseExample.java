package com.sda.she_likes_java.objects;

public class HouseExample {
    public static void main(String[] args) {
        Home myhouse;
        myhouse  = new Home(3, 1);
        System.out.println("I have a house with " + myhouse.getNumberOfBathrooms() + " bathrooms");
        System.out.println("I need more bathrooms");
        myhouse.setNumberOfBathrooms(2);
        System.out.println("The number of bathrooms is now " + myhouse.getNumberOfBathrooms());
    }
}
