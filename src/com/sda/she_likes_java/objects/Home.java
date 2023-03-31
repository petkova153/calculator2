package com.sda.she_likes_java.objects;

public class Home {
    private int numberOfRomms;
    private int numberOfBathrooms;

    public int getNumberOfRomms() {
        return numberOfRomms;
    }

    public void setNumberOfRomms(int numberOfRomms) {
        this.numberOfRomms = numberOfRomms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public Home(int numberOfRomms, int numberOfBathrooms) {
        this.numberOfRomms = numberOfRomms;
        this.numberOfBathrooms = numberOfBathrooms;
    }

    @Override
    public String toString() {
        return "Home{" +
                "numberOfRomms=" + numberOfRomms +
                ", numberOfBathrooms=" + numberOfBathrooms +
                '}';
    }
}
