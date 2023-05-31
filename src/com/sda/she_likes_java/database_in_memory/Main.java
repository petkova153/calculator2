package com.sda.she_likes_java.database_in_memory;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection conneciton = DatabaseInUtils.getConnection(DbCredentials.url, DbCredentials.username, DbCredentials.password);
        System.out.println("Is connection present? " + (conneciton != null));

        DbInit.prepareData(conneciton);
    }
}
