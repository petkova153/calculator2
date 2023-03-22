package com.sda.she_likes_java.time_and_date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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

        System.out.println("Let's format a bit.");
        //System.out.println(currentDateTime.format(DateTimeFormatter.RFC_1123_DATE_TIME));
        System.out.println(currentDateTime.format(DateTimeFormatter.BASIC_ISO_DATE));
    }
}
