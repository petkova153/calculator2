package com.sda.she_likes_java.operators;

public class TernaryOperator {
    public static void main(String[] args) {
        System.out.println("My full name is" + getMyName(true));
    }

    public static String getMyName (boolean FullName){
//        if (FullName){
//            return("Aleksandra Petkova");
//        }
//        else{
//            return("Aleksandra");
//        }
        String result = FullName ? "Aleksandra Petkova": "Aleksandra";
        return result;
    }
}
