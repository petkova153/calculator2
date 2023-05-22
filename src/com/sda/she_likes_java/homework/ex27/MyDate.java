package com.sda.she_likes_java.homework.ex27;

import org.jetbrains.annotations.NotNull;

public class MyDate implements Comparable<MyDate>{
    final private int year;
    final private int day;
    final private int month;

    public MyDate(int year, int day, int month) {
        this.year = year;
        this.day = day;
        this.month = month;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", day=" + day +
                ", month=" + month +
                '}';
    }

    public int getYear() {
        return year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    @Override
    public int compareTo(@NotNull MyDate d) {
        int years = this.year - d.getYear();
        int months = this.month - d.getMonth();
        int days = this.day - getDay();

        if (years != 0){
            return years;
        }
        else{
            if (months != 0)
            {return months;
            }
            else{
                if (days != 0)
                {
                    return days;
                }
            }
        }
        return 0;
    }
}
