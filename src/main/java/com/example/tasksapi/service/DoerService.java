package com.example.tasksapi.service;

import com.example.tasksapi.model.*;

import java.util.List;

public interface DoerService {
    List<Doer> getAllDoers();

    Doer getDoerById(Long id);

    Doer createDoer(Doer doer);

    Doer updateDoer(Long id, Doer doer);

    Doer getDoerByName(String name);

    void deleteDoer(Long id);

}
