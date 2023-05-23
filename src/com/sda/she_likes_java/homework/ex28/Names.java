package com.sda.she_likes_java.homework.ex28;

public class Names {
    private final String name;

    public Names(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Names{" +
                "name='" + name + '\'' +
                '}';
    }
}
