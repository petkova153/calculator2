package com.sda.she_likes_java.exceptions;

import java.time.LocalDateTime;

public class Secret {
    private final LocalDateTime timeOfSecret;

   private final String mySecret;

    public Secret(LocalDateTime timeOfSecret, String mySecret) {
        this.timeOfSecret = timeOfSecret;
        this.mySecret = mySecret;
    }

    public LocalDateTime getTimeOfSecret() {
        return timeOfSecret;
    }

    public String getMySecret() {
        return mySecret;
    }

    @Override
    public String toString() {
        return "Secret{" +
                "timeOfSecret=" + timeOfSecret +
                ", mySecret='" + mySecret + '\'' +
                '}';
    }
}
