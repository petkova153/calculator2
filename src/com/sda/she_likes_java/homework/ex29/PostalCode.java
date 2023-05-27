package com.sda.she_likes_java.homework.ex29;

public class PostalCode {
    final private String pCode;

    public PostalCode(String pCode) {
        this.pCode = pCode;
    }

    public String getpCode() {
        return pCode;
    }

    @Override
    public String toString() {
        return "PostalCode{" +
                "pCode='" + pCode + '\'' +
                '}';
    }
}
