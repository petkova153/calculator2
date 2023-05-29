package com.sda.she_likes_java.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestRecordProgram {
    public static void main(String[] args) {
        Connection connection = DatabaseUtils.getConnection();
        System.out.println("got connection? " + (connection != null));

        TestRecordRepository recordRepository = new TestRecordRepository(connection);
        recordRepository.getAllTestRowsFromDB();
    }


    }

