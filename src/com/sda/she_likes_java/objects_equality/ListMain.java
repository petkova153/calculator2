package com.sda.she_likes_java.objects_equality;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List personList = new ArrayList();
        Person oneP = new Person("egg","humpty",44);
        Person twoP = new Person("shell", "wall", 4);

        personList.add(oneP);
        personList.add(twoP);
        System.out.println(personList);
        Object onePerson = personList.get(1);

        System.out.println("what is onePerson looks" +onePerson);

        List<Person> personFromList = new ArrayList<>();
        personFromList.add(oneP);
        personFromList.add(twoP);
        System.out.println("lets see it now: " + personFromList.get(0));
        List<Car> newCarList = new ArrayList<>();
        newCarList.add(new Car("blue"));
        personFromList.add(new Car("green"));
    }

}
