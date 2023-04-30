package com.geekster.JobSearchPortal.controller;

import com.geekster.JobSearchPortal.model.Users;
import com.geekster.JobSearchPortal.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UsersService usersService;

    @GetMapping(value="/AllUsers")
    public Iterable<Users> getUsers(){
        return usersService.getAllUsers();
    }
    @GetMapping(value="/getUsers/{employName}")
    public List<Users> getUsersByName(@PathVariable String employName){
        return usersService.fetchUserByName(employName);
    }

    @GetMapping(value="/SortedSalary")
    public List<Users> getOrderedSalary(){
        return usersService.getAllUsersSortedSalary();
    }

    @PostMapping("/AddUsers")
    public String  insertUsers(@RequestBody List<Users> usersList){
        return usersService.addUsers(usersList) ;
    }
    @DeleteMapping("/deleteUsers/{id}")
    public void deleteUserById(@PathVariable Integer id){
        usersService.removeUserById(id);
    }


}
