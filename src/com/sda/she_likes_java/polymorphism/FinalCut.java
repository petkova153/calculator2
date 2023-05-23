package com.sda.she_likes_java.polymorphism;

public final class FinalCut {
    String name;

    public FinalCut(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "FinalCut{" +
                "name='" + name + '\'' +
                '}';
    }
}
