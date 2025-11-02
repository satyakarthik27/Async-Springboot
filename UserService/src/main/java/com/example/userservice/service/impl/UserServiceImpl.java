package com.example.userservice.service.impl;

import com.example.userservice.exception.UserFetchException;
import com.example.userservice.model.UserModel;
import com.example.userservice.repository.UserRepository;
import com.example.userservice.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRepository userRepo;

    @Override
    public List<UserModel> getAllUsers() {
        try {
            return userRepo.findAll();
        } catch (Exception e) {
            logger.error("Failed to fetch users from database", e);
            throw new UserFetchException("Unable to retrieve user data", e);
        }
    }
}
