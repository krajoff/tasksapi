package com.example.tasksapi.repository;

import com.example.tasksapi.model.Doer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoerRepository  extends JpaRepository<Doer, Long> {
}
