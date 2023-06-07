package com.sda.she_likes_java.homework.ex32;

public class Calc implements Calculator {
    public final int number1;
    public final int number2;

    public Calc(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public String toString() {
        return "Calc{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                '}';
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    @Override
    public int add(int number1, int number2) {
        return number1+number1;
    }

    @Override
    public int sub(int number1, int number2) {
        return number1-number2;
    }

    @Override
    public int div(int number1, int number2) {
        return number1/number2;
    }

    @Override
    public void mult() {

    }
}
