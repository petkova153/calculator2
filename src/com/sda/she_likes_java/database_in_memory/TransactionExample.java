package com.sda.she_likes_java.database_in_memory;

import java.sql.Connection;

public class TransactionExample {

    public static void main(String[] args) {

        Connection connection = DbConnectionUtils.getConnection(DbCredentials.url, DbCredentials.username,
                DbCredentials.password);

        try {

        } catch (Exception e) {

        }
    }
}
