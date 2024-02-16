package com.example.tasksapi.controller;

import com.example.tasksapi.model.User;
import com.example.tasksapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserControllerImp implements UserController {

    private UserService userService;

    @Autowired
    public UserControllerImp(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @GetMapping("{id}")
    public User getUserById(Long id) {
        return userService.findById(id);
    }

    @PostMapping
    public User createUser(User user) {
        return userService.save(user);
    }

    @PutMapping("/{id}")
    public User updateUser(Long id, User user) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(Long id) {
        userService.delete(id);
    }
}
