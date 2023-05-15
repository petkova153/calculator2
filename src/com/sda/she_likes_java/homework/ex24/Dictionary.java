package com.sda.she_likes_java.homework.ex24;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private final Map<String, String> dictionary;
    public Dictionary() {
        dictionary = new HashMap<>();
        dictionary.put("house", "kyshta");
        dictionary.put("sun", "slynce");
        dictionary.put("moon", "luna");
        dictionary.put("sky", "nebe");
        dictionary.put("tree", "dyrvo");
        dictionary.put("school", "uchilishte");
        dictionary.put("pupil", "uchenik");
        dictionary.put("teacher", "uchitel");
        dictionary.put("blackboard", "dyska");
        }


    public void addWords(String word, String translation){
        dictionary.put(word,translation);
    }

    public String translateFromSourceLanguageToDestiny(String sourceWord) {
        String wordTranslation = dictionary.get(sourceWord);
        if (wordTranslation != null) {
            System.out.printf("English word: [%s] means [%s] in Bulgarian%n", sourceWord, wordTranslation);
        } else {
            System.out.printf("Don't know how to translate [%s] into Bulgarian%n", sourceWord);
        }
        return wordTranslation;
    }
}
