package com.sda.she_likes_java.database;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection canl = DatabaseUtils.getConnection();

        //CREATE TABLE TEST(ID INT PRIMARY KEY, NAME VARCHAR(255));
        //
        //* Script for creating table
        //* CREATE TABLE TEST
        //* (ID INT PRIMARY KEY, NAME VARCHAR(255));
        //*
        //* Script for inserting one record (row) into table
        //* INSERT INTO
        //* TEST(ID, NAME)
        //* VALUES(1, 'Olga');
        //

        //SELECT ID, NAME
        //FROM TEST;
        //
        //
        //* Script for creating table
        //* CREATE TABLE TEST
        //* (ID INT PRIMARY KEY, NAME VARCHAR(255));
        //*
        //* Script for inserting one record (row) into table
        //* INSERT INTO
        //* TEST(ID, NAME)
        //* VALUES(1, 'Olga');
        //*
        //* Script for reading data
        //* SELECT ID, NAME
        //* FROM TEST;
        //UPDATE TEST -- name of table to update
        //SET NAME = 'Alma' -- column value to change
        //WHERE ID=2; -- selected raw
        //
        //DELETE
        //FROM TEST
        //WHERE ID=3;

        try{
            DatabaseUtils.getConnectionButSometimesThrowException();
        } catch (SQLException e){
            System.out.println("Opps a daisey");
        }
    }
}
