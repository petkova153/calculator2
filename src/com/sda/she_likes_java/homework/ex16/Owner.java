package com.sda.she_likes_java.homework.ex16;

public class Owner {
    private String name;
    private String surname;
    private Animal pet;

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pet=" + pet +
                '}';
    }

    public Owner(String name, String surname, Animal pet) {
        this.name = name;
        this.surname = surname;
        this.pet = pet;
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

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public static void main(String[] args) {
        Owner myself;
        Animal pet;
        String petname;

        pet = new Animal("Ricky", 10, "n/a");
        myself = new Owner("Alex", "Verb", pet);
        petname = myself.pet.name;
        System.out.println("Hi, my name is %s %s and I have a cat named %s who really enjoys lounging all day long."
                .formatted(myself.name, myself.surname, petname));
    }
}
