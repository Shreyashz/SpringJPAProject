package com.carrental.projfinal.controller;

import com.carrental.projfinal.repository.UserRepository;
import com.carrental.projfinal.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Rental/profile")
public class UserController {
    private final UserRepository users;

    public UserController(UserRepository users){
        this.users = users;
    }

    @GetMapping
    public Iterable<User> findAll(){
        return users.findAll();
    }
    @GetMapping("/{id}")
    public User findById(@PathVariable("id") User user){
        return user;
    }
}
