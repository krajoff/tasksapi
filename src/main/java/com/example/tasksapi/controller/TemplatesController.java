package com.example.tasksapi.controller;

import com.example.tasksapi.service.DoerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/all")
public class TemplatesController {

    private final DoerService doerService;

    @Autowired
    public TemplatesController(DoerService doerService) {
        this.doerService = doerService;
    }

    @GetMapping
    public String getAllUsers(Model model) {
        model.addAttribute("doers", doerService.getAllDoers());
        return "alldoers";
    }
}
