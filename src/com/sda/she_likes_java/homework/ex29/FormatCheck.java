package com.sda.she_likes_java.homework.ex29;

import java.util.regex.Pattern;

public class FormatCheck {
    void checkPostalCode(String postalCode) throws Exception{
        if (Pattern.matches("[0-9]{5}", postalCode))
        {
            System.out.println(postalCode);
            System.out.println("Passed");
        }
        else{
            throw new Exception();
        }
    }

}
