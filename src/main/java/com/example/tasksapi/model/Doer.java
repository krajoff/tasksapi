package com.example.tasksapi.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="doers")
public class Doer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(nullable = false)
    String name;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "doer_task",
            joinColumns = @JoinColumn(name = "doer_id"),
            inverseJoinColumns = @JoinColumn(name = "task_id"))
    private final Set<Task> tasks = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
