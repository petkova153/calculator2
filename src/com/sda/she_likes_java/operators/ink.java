package com.sda.she_likes_java.operators;

public class ink {
    public static void main(String[] args) {
        int one;
        int two;

        one = 10;
        two = 10;

        //postincrementation
        one++;
        two--;
        System.out.println("value of one is " + one);
        System.out.println("value of two is " + two);

        //preincrementation
        ++one;
        --two;
        System.out.println("value of one is " + one);
        System.out.println("value of two is " + two);
        int three;

        // pre incrementation will first increment and then assign and postincrementation will assign and then increment

        three = ++one;
        System.out.println("three " + three);
        System.out.println("one " + one);

        int four;
        four = one++;
        System.out.println(one);
        System.out.println("postincrementation is going to assign the current " +
                "value of one and late will increment" + four);

    }
}
