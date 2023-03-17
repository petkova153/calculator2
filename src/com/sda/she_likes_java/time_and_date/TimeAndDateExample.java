package com.sda.she_likes_java.time_and_date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TimeAndDateExample {
    public static void main(String[] args) {
        LocalDate currentDate;

        currentDate = LocalDate.now();
        System.out.println("Current date is: " + currentDate);
        System.out.println("The day is " + currentDate.getDayOfMonth());
        System.out.println("The month is " + currentDate.getMonth());
        System.out.println("The month is " + currentDate.getYear());

        LocalDateTime currentDateTime;
        currentDateTime = LocalDateTime.now();
        System.out.println("Local date is: " + currentDateTime);

    }
}
