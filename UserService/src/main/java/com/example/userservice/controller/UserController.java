package com.example.userservice.controller;

import com.example.userservice.model.UserModel;
import com.example.userservice.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user-service")
    public List<UserModel> getUsers() {
        return userService.getAllUsers();
    }
}
