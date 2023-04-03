package com.example.gymhelper.service;

import com.example.gymhelper.model.Trainer;
import com.example.gymhelper.repo.TrainerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TrainerService {
    private final TrainerRepository trainerRepository;

    public List<Trainer> getAll() {
        return trainerRepository.findAll();
    }
}
