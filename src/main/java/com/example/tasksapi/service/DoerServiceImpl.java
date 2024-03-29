package com.example.tasksapi.service;

import com.example.tasksapi.model.*;
import com.example.tasksapi.repository.DoerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoerServiceImpl implements DoerService {
    @Autowired
    private DoerRepository doerRepository;

    @Override
    public List<Doer> getAllDoers() {
        return doerRepository.findAll();
    }

    @Override
    public Doer getDoerById(Long id) {
        return doerRepository.
                findById(id).orElseThrow(() ->
                        new RuntimeException("Doer not found"));
    }

    @Override
    public Doer createDoer(Doer doer) {
        return doerRepository.save(doer);
    }

    @Override
    public Doer updateDoer(Long id, Doer doer) {
        Doer exsitingDoer = getDoerById(id);
        exsitingDoer.setName(doer.getName());
        return doerRepository.save(exsitingDoer);
    }

    @Override
    public void deleteDoer(Long id) {
        getDoerById(id);
        doerRepository.deleteById(id);
    }
}
