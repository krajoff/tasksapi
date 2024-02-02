package com.example.tasksapi.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;


@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String description;

    @Column()
    private Status status;

    @CreatedDate
    @Column()
    private LocalDate date = LocalDate.now();

    @ManyToOne
    @JoinColumn(name = "doer_id")
    private Doer doer;

    public Doer getDoer() {
        return doer;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDoer(Doer doer) {
        this.doer =doer;
    }
}
