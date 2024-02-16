package com.example.tasksapi.repository;

import com.example.tasksapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<User, Long> {
}
