package com.sda.she_likes_java.homework.ex29;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
//        ArrayList<PostalCode> postCodes = new ArrayList<>();
//        postCodes.add(new PostalCode("LT04120"));
//        postCodes.add(new PostalCode("BG1220"));
        PostalCode newCode = new PostalCode("BG1220");

        String testCode = newCode.getpCode() + "!";
        System.out.println(newCode.getpCode());
        FormatCheck newCheck = new FormatCheck();
        try {
            newCheck.checkPostalCode("12201");
        } catch (Exception e){
            System.out.println("Wrong format");
        }
        finally {
            System.out.println("Passed");

        }
    }
}
