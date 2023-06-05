package com.sda.she_likes_java.database_in_memory;

import java.sql.Connection;
import java.sql.SQLException;

public class ClosingDbConnectionExample {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = DbConnectionUtils.getConnectionRiskyWay(DbCredentials.url,
                    DbCredentials.username, DbCredentials.password);
        } catch (SQLException e) {
            System.out.println("Some exception: " + e);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        //

        //better way to test connection as above just in less code
        System.out.println("Now let's use better way to close connection - available since Java 7");
        try {
            connection = DbConnectionUtils.getConnectionRiskyWay(DbCredentials.url,
                    DbCredentials.username, DbCredentials.password);
        } catch (SQLException e) {
            System.out.println("Some exception: " + e);
        }
    }
        private static void handleString (String str){
            if (str != null) {
                System.out.println("String length is: " + str.length());
            }
        }

}

