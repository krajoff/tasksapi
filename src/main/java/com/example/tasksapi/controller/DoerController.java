package com.example.tasksapi.controller;

import com.example.tasksapi.model.*;
import com.example.tasksapi.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doers")
public class DoerController {
    @Autowired
    private DoerService doerService;

    @GetMapping
    public List<Doer> getAllDoers() {
        return doerService.getAllDoers();
    }

    @GetMapping("/{id}")
    public Doer getDoerById(@PathVariable Long id) {
        return doerService.getDoerById(id);
    }
    @PostMapping
    public Doer createDoer(@RequestBody Doer doer) {
        return doerService.createDoer(doer);
    }

    @PutMapping("/{id}")
    public Doer updateDoer(@PathVariable Long id, @RequestBody Doer doer) {
        return doerService.updateDoer(id, doer);
    }

    @DeleteMapping("/{id}")
    public void deleteDoer(@PathVariable Long id) {
        doerService.deleteDoer(id);
    }

}
