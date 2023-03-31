package com.sda.she_likes_java.objects;

public class HouseOwner {
    private String name;
    private Home house;

    public HouseOwner(String name, Home house) {
        this.name = name;
        this.house = house;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Home getHouse() {
        return house;
    }

    public void setHouse(Home house) {
        this.house = house;
    }

    @Override
    public String toString() {
        return "HouseOwner{" +
                "name='" + name + '\'' +
                ", house=" + house +
                '}';
    }
}
