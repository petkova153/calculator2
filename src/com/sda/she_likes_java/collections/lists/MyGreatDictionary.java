package com.sda.she_likes_java.collections.lists;
import java.util.ArrayList;
import java.util.List;
public class MyGreatDictionary {
    private List<Words> dictionary;
    public MyGreatDictionary() {
        dictionary = new ArrayList<>();
    }

    public void fillWithWordsBilingual(List<Words> listOfWords) {
        dictionary.addAll(listOfWords);
    }
    public void translateFromSourceLanguageToDestiny(String sourceWord) {

    }
}
