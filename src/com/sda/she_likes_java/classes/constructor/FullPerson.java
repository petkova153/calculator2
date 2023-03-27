package com.sda.she_likes_java.classes.constructor;

public class FullPerson {
    private String name;
    private String surname;
    private int age;
    private FullAddress address;

    public FullPerson(String name, String surname, int age, FullAddress address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0)
        {
            this.age = age;
        }
    }

    public FullAddress getAddress() {
        return address;
    }

    public void setAddress(FullAddress address) {
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
