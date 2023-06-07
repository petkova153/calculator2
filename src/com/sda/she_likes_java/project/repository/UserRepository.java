package com.sda.she_likes_java.project.repository;

import com.sda.she_likes_java.project.entity.User;
import com.sda.she_likes_java.project.exception.InexperiencedUserException;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {
    private static long userCounter;
    private Map<Long, User> users;

    public UserRepository(){
        this.users = new HashMap<>();
    }
    public void registerNewUser(String name,
                                String surname,
                                LocalDate dateOfBirth,
                                String login,
                                String password,
                                LocalDate drivingLicenseIssueDate) throws InexperiencedUserException {
        //check license
        checkDiveresLicenseDate(drivingLicenseIssueDate);
        //get id
        long id = nextId();
        //register
        User newUser = new User(name,surname,login,password,drivingLicenseIssueDate,dateOfBirth);
        users.put(id,newUser);
    }
    private static long nextId(){
        return  ++userCounter;
    }
    private void checkDiveresLicenseDate(LocalDate driversLicenseDate) throws InexperiencedUserException {
        LocalDate currentDate = LocalDate.now();
        final int requiredNumberOfYears = 3;
        LocalDate boundaryDate = driversLicenseDate.plusYears(requiredNumberOfYears);

        if (boundaryDate.isAfter((currentDate))) {
            throw new InexperiencedUserException("Better buy a bike!");
        }
    }
    public void deleteUser(){
    //TODO
    }

    public List<User> listUsers(){
        return List.of();
    }

    public void updateUser(User user){
        //TODO
    }
    //TODO
    public List<User> getUsersBasedOnCriteria(){
        return List.of();
    }
    //TODO
    public List<User> getOrderedUsers(Comparator<User> comparator) {
        return List.of();
    }
}
