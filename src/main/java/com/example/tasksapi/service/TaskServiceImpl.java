package com.example.tasksapi.service;

import com.example.tasksapi.model.*;
import com.example.tasksapi.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private DoerService doerService;

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task getTaskById(Long id) {
        return taskRepository.
                findById(id).orElseThrow(() ->
                        new RuntimeException("Task not found"));
    }

    @Override
    public List<Task> getTasksByStatus(Status status) {
        return taskRepository.findByStatus(status);
    }

    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task updateTask(Long id, Task task) {
        Task exsitingTask = getTaskById(id);
        exsitingTask.setDescription(task.getDescription());
        exsitingTask.setStatus(task.getStatus());
        return taskRepository.save(exsitingTask);
    }

    @Override
    public void deleteTask(Long id) {
        getTaskById(id);
        taskRepository.deleteById(id);
    }

    public Task assignDoer(Long id, Long doerId) {
        Task existingTask = getTaskById(id);
        Doer doer = doerService.getDoerById(doerId);
        existingTask.setDoer(doer);
        return taskRepository.save(existingTask);

    }

}
