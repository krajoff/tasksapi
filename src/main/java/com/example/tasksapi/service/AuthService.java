package com.example.tasksapi.service;

import com.example.tasksapi.model.User;
import com.example.tasksapi.repository.SessionRepository;
import com.example.tasksapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class AuthService {

    private SessionRepository sessionRepository;

    @Autowired
    private UserRepository userRepository;

    public boolean login(String username, String password) {
        if (userRepository.findByName(username).isPresent()) {
            User user = userRepository.findByName(username).get();
            if (user.getPassword().equals(password)) {
                sessionRepository.save(user);
                return true;
            }
        }
        return false;
    }

    public User register(User user) {
        if (userRepository.findByName(user.getName()).isEmpty()) {
            return userRepository.save(user);
        } else {
            throw new RuntimeException("User is already existed");
        }
    }

    public void logout(Long id) {
        sessionRepository.deleteById(id);
    }
}
