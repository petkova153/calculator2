package com.sda.she_likes_java.database_in_memory;

public class AccentureStudent {
    //Integer instead of int because ID can contain 0
    private Integer ID;
    private String name;
    private String surname;
    private int age;
    private String sex;

    public AccentureStudent(Integer ID, String name, String surname, int age, String sex) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "AccentureStudent{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
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
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
