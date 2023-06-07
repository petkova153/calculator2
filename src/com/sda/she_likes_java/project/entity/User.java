package com.sda.she_likes_java.project.entity;

import java.time.LocalDate;
import java.util.Objects;

public record User(String name, String surname, int age, String login, String passwrod,
                   LocalDate drivingLicenseIssueDate, LocalDate dateOfBirth) {

}
