package com.example.tasksapi.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "doers")
public class Doer implements IDoer{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public static class DoerBuilder {
        private final Doer doer = new Doer();

        public Doer.DoerBuilder name(String name) {
            doer.setName(name);
            return this;
        }

        public Doer build() {
            return doer;
        }
    }
}
