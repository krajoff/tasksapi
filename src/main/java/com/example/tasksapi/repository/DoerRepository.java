package com.example.tasksapi.repository;

import com.example.tasksapi.model.Doer;
import com.example.tasksapi.model.Status;
import com.example.tasksapi.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DoerRepository  extends JpaRepository<Doer, Long> {

    @Query(value = "select * from doers d where d.name = ?1",  nativeQuery = true)
    List<Doer> findByName(String string);
}
