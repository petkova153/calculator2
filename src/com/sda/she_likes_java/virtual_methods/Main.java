package com.sda.she_likes_java.virtual_methods;

public class Main {
    public static void main(String[] args) {
        Mammal person = new Human();

        person.whoYouAre();
        Human nullHuman = null;
        HumanLife humanLife = new HumanLife();
        humanLife.tellMeWhoYouAre(nullHuman);

        Woman woman1 = new Woman();
        humanLife.tellMeWhoYouAre(woman1);

        System.out.println("Casting objects");
        Man manForSure = new Man();
        Human anotherMan = manForSure;
        humanLife.tryToCastHumanToMan(anotherMan);
        humanLife.tryToCastHumanToMan(new Man());
    }
}
