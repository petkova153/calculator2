package com.sda.she_likes_java.homework.exercise17;

public class Book {
    private static int numberOfBooks;
    private String title;
    private String author;
    private int yearOfIssue;

    public Book(String title, String author, int yearOfIssue) {
        this.title = title;
        this.author = author;
        this.yearOfIssue = yearOfIssue;
        numberOfBooks++;
    }

    public static int getNumberOfBooks(){
        return numberOfBooks;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                '}';
    }
}
