package com.geekster.JobSearchPortal.service;

import com.geekster.JobSearchPortal.model.Users;
import com.geekster.JobSearchPortal.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    @Autowired
    IUserRepository userRepository;

    public Iterable<Users> getAllUsers() {
        Iterable<Users> allUsers=   userRepository.findAll();
        return allUsers;
    }

    public String  addUsers(List<Users> usersList) {
        Iterable<Users> addedUsers= userRepository.saveAll(usersList);
        if(addedUsers!=null)
            return "yes";
        else
            return "no";

    }

    public List<Users> fetchUserByName(String employName) {
        return userRepository.findByEmployName(employName);
    }

    public void removeUserById(Integer id) {
        userRepository.deleteById(id);
    }

    public List<Users> getAllUsersSortedSalary(){
        return userRepository.findUsersOrderedBySalaryASC();
    }
}
