package com.example.tasksapi.repository;

import com.example.tasksapi.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    //SELECT * FROM tasks where status = 1;
    @Query(value = "select * from tasks t where t.status = ?1",  nativeQuery = true)
    List<Task> findByStatus(Status status);
}

