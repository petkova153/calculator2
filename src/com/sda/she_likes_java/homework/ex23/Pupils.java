package com.sda.she_likes_java.homework.ex23;

import java.util.Objects;

public class Pupils {
    private String name;
    private String surname;
    private int year;

    public Pupils(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Pupils{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pupils pupils = (Pupils) o;
        return year == pupils.year && Objects.equals(name, pupils.name) && Objects.equals(surname, pupils.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year);
    }
}
