package com.sda.she_likes_java.homework.exercise17;

public class BookLendingLibrary {
    public static void main(String[] args) {
        Book book1 = new Book("LOTR","RR",1985);
        bookGenerator();
        System.out.println("Number of created books is:" + Book.getNumberOfBooks());
    }

    public static void bookGenerator(){
        Book book1 = new Book("LOTR2","RR",1985);
        Book book2 = new Book("LOTR3","RR",1985);
        Book book3 = new Book("LOTR4","RR",1985);
    }
    public static void copyGenerator(){

    }
}
