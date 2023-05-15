package com.sda.she_likes_java.homework.ex24;

public class Main {
    public static void main(String[] args) {
        Dictionary someDictionary = new Dictionary();
        String word1 = someDictionary.translateFromSourceLanguageToDestiny("house");
        System.out.println("The word house is translated " + word1);
        someDictionary.addWords("bridge", "most");
        System.out.println("We have added the word bridge which is translated as "
                + someDictionary.translateFromSourceLanguageToDestiny("bridge"));
    }
}
