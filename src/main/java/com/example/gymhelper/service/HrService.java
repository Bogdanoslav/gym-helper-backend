package com.example.gymhelper.service;

import com.example.gymhelper.exceptions.UserNotFoundException;
import com.example.gymhelper.model.HrSpecialist;
import com.example.gymhelper.model.Manager;
import com.example.gymhelper.repo.HrRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HrService {
    private final HrRepository hrRepository;

    public HrSpecialist getById(Long id) {
        return hrRepository.findById(id).orElseThrow(()-> new UserNotFoundException("Manager not found"));
    }
}
