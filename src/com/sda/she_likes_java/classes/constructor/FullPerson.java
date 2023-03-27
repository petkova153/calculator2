package com.sda.she_likes_java.classes.constructor;

public class FullPerson {
    String name;
    String surname;
    int age;
    FullAddress address;

    public FullPerson(String name, String surname, int age, FullAddress address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "FullPerson{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
    public void describeYourself()
    {
        System.out.println("Hi I am " + name);
    }
    public static void genericDescription() {
        // static is used even without an object
        System.out.println("Generic description");
    }
    public static void main(String[] args) {
        FullAddress addressNP;

        addressNP = new FullAddress("Portuga", "Lisbon", "Summer", "2021");

        FullPerson newPerson;
        FullPerson personWithoutAddress;
        newPerson = new FullPerson("Pincess", "Snowwhite", 22, addressNP);
        personWithoutAddress = new FullPerson("Mario", "JustMario", 35,null);
        System.out.println(newPerson);
        newPerson.describeYourself();
        personWithoutAddress.describeYourself();
        genericDescription();
    }
}
