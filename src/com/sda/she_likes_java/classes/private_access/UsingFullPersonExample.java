package com.sda.she_likes_java.classes.private_access;

import com.sda.she_likes_java.classes.constructor.FullPerson;

public class UsingFullPersonExample {
    public static void main(String[] args) {
        FullPerson onTheRun;

        onTheRun = new FullPerson("Maria", "Petrova", 22, null);
        System.out.println(onTheRun.getAge());
    }
}
