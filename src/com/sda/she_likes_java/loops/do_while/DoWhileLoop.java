package com.sda.she_likes_java.loops.do_while;

public class DoWhileLoop {
    public static void main(String[] args) {
        boolean isAdult;
        int age;
        age = 4;
        do
        {
            if (age < 18)
                isAdult = false;
            else
                isAdult = true;
            age++;
            System.out.println(age);
        }
        while (!isAdult);

        if (age <= 18)
            System.out.println("One more year to wait");
        else
            System.out.println("You are old enough now.");
    }
}
