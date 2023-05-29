package com.sda.she_likes_java.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtils {
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/Data/she-goes-tech/db",
                    "sa",
                    "sa");
        } catch (SQLException e) {
            System.out.println("Exception occurred during database connection: " + e);
            return null;
        }
    }
        // declare
        public static Connection getConnectionButSometimesThrowException() throws SQLException {
            return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/Data/she-goes-tech/db",
                    "sa",
                    "sa");
        }
    }
