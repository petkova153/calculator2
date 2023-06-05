package com.sda.she_likes_java.optional;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        String nick = optionalNick().get();
        System.out.println("Nick is: " + nick);

        if (emptyNick().isPresent()) {
            System.out.println("Nick is: " + emptyNick().get());
        }

        //if empty it is nto going to do anything
        optionalNick().ifPresent(s -> System.out.println("1 Nick is: " + s));
        emptyNick().ifPresent(s -> System.out.println("2 Nick is: " + s));
    }

    public static String personNick() {
        return null;
    }

    public static Optional<String> emptyNick() {
        return Optional.empty();
    }

    public static Optional<String> optionalNick() {
        return Optional.of("maniek");
    }
}