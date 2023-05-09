package com.sda.she_likes_java.homework.ex23;

import java.util.Objects;

public class Subject {
    private String subName;
    private Double grade;

    public Subject(String subName, Double grade) {
        this.subName = subName;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subName='" + subName + '\'' +
                ", grade=" + grade +
                '}';
    }

    public String getSubName() {
        return subName;
    }

    public Double getGrade() {
        return grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return Objects.equals(subName, subject.subName) && Objects.equals(grade, subject.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subName, grade);
    }
}
