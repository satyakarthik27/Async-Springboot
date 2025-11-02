package com.example.userservice.service;

import com.example.userservice.model.UserModel;
import java.util.List;

public interface UserService {
    List<UserModel> getAllUsers();
}
