package com.example.tasksapi.controller;

import com.example.tasksapi.model.Doer;
import com.example.tasksapi.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public interface UserController {

    @GetMapping
    public List<User> getAllUsers();

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id);

    @PostMapping
    public User createUser(@RequestBody User user);

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user);

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id);
}
