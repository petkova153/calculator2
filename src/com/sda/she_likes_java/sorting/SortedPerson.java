package com.sda.she_likes_java.sorting;

import org.jetbrains.annotations.NotNull;

public class SortedPerson implements Comparable<SortedPerson> {
    final private String name;

    final private int age;

    public SortedPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "SortedPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(@NotNull SortedPerson o) {
        // age = 2 vs o.age = 3
//        return o.getAge() - age;
//        return age - o.getAge();
        System.out.println("Called by Java");
        if (age < o.getAge()) {
            return -1;
        } else if (age > o.getAge()) {
            return 1;
        } else {
            return 0;
        }
    }
}
