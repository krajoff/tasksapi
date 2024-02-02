package com.example.tasksapi.service;

import com.example.tasksapi.model.*;

import java.util.List;

public interface DoerService {
    List<Doer> getAllDoers();

    Doer getDoerById(Long id);

    Doer createDoer(Doer doer);

    Doer updateDoer(Long id, Doer doer);

    void deleteDoer(Long id);

}
