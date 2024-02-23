package com.example.tasksapi.model;

public interface ITask {
    public Long getId();
    public String getDescription();
    public Status getStatus();
}
