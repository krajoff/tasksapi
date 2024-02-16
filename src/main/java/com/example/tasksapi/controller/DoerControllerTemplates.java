package com.example.tasksapi.controller;

import com.example.tasksapi.service.DoerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alldoers")
public class DoerControllerTemplates {

    private final DoerService doerService;

    @Autowired
    public DoerControllerTemplates(DoerService doerService) {
        this.doerService = doerService;
    }

    @GetMapping
    public String getAllUsers(Model model) {
        model.addAttribute("doers", doerService.getAllDoers());
        return "alldoers";
    }
}
