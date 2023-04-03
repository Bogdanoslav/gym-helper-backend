package com.example.gymhelper.service;

import com.example.gymhelper.model.Paramedic;
import com.example.gymhelper.model.Trainer;
import com.example.gymhelper.repo.ParamedicRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ParamedicService {
    private final ParamedicRepository paramedicRepository;

    public List<Paramedic> getAll() {
        return paramedicRepository.findAll();
    }
}
