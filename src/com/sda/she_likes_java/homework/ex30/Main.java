package com.sda.she_likes_java.homework.ex30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Main {
//    public static void main(String[] args) throws SQLException {
//        String jdbcURL = "jdbc:h2:~\\Data\\she-goes-tech\\db";
//        String username = "sa";
//        String password = "sa";
//
//        Connection connection = DriverManager.getConnection(jdbcURL, username, password);
//        System.out.println("Connected to H2 in server mode.");
//
//        String sql = "SELECT * FROM STUDENTS";
//
//        Statement statement = connection.createStatement();
//
//        ResultSet resultSet = statement.executeQuery(sql);
//
//        int count = 0;
//
//        while (resultSet.next()) {
//            count++;
//
//            int ID = resultSet.getInt("ID");
//            String name = resultSet.getString("name");
//            System.out.println("Student #" + count + ": " + ID + ", " + name);
//        }
//
//        connection.close();
//    }
}
