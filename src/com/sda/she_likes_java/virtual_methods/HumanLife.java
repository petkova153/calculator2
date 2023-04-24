package com.sda.she_likes_java.virtual_methods;

public class HumanLife {
    public void tellMeWhoYouAre(Human person){
        if (person != null){
            person.whoYouAre();
        }
    }
    public void tryToCastHumanToMan(Human person){
        if (person instanceof Man) {
            // casting / down casting
            // works for the references

            ((Man) person).learnToFly();
        }

        if (person instanceof Woman) {
            ((Woman) person).learnJava();
        }
    }
}
