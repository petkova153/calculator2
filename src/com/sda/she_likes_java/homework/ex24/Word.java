package com.sda.she_likes_java.homework.ex24;

public class Word {
    private final String sourceWord;
    private final String destWord;

    public Word(String sourceWord, String destWord) {
        this.sourceWord = sourceWord;
        this.destWord = destWord;
    }

    @Override
    public String toString() {
        return "Word{" +
                "sourceWord='" + sourceWord + '\'' +
                ", destWord='" + destWord + '\'' +
                '}';
    }

    public String getSourceWord() {
        return sourceWord;
    }

    public String getDestWord() {
        return destWord;
    }
}
