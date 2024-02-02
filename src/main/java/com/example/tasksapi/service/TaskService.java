package com.example.tasksapi.service;

import com.example.tasksapi.model.*;

import java.util.List;

public interface TaskService {

    List<Task> getAllTasks();

    Task getTaskById(Long id);

    List<Task> getTasksByStatus(Status status);

    Task createTask(Task task);

    Task updateTask(Long id, Task task);

    void deleteTask(Long id);

    Task assignDoer(Long id, Long doerId);
}
