package com.sda.she_likes_java.database_in_memory;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Connection conneciton = DatabaseInUtils.getConnection(DbCredentials.url, DbCredentials.username, DbCredentials.password);
        System.out.println("Is connection present? " + (conneciton != null));

        DbInit.prepareData(conneciton);
        System.out.println("Let's read all students");
        AccentureStudentsInMemory repository = new AccentureStudentsInMemory(conneciton);
        List<AccentureStudent> students = repository.getAllStudents();
        System.out.println("Students are " + students);
        for(AccentureStudent stUdent:students){
            System.out.println(stUdent);

        }
    }
}
