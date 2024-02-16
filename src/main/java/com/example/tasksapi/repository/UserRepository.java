package com.example.tasksapi.repository;

import com.example.tasksapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "select * from users u where u.name = ?1", nativeQuery = true)
    Optional<User> findByName(String name);
}
