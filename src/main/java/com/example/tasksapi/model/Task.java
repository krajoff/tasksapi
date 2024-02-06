package com.example.tasksapi.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;
import java.util.List;


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

    @OneToMany
    @JoinColumn(name = "doer_id")
    private List<Doer> doers;

    public List<Doer> getDoers() {
        return doers;
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

    public void setDoers(List<Doer> doers) {
        this.doers = doers;
    }

    public List<Doer> addDoer(Doer doer){
        doers.add(doer);
        return doers;
    }
}
