package com.azizdev.authsystem.service;

import com.azizdev.authsystem.model.User;
import com.azizdev.authsystem.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserSerivice {

    private final UserRepository userRepository;

    public UserSerivice(UserRepository userRepository, EmailService emailService) {
        this.userRepository = userRepository;
    }

    public List<User> allUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

}
