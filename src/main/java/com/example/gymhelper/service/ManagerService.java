package com.example.gymhelper.service;

import com.example.gymhelper.dto.UpdateManagerProfile;
import com.example.gymhelper.exceptions.UserNotFoundException;
import com.example.gymhelper.mapper.ManagerMapper;
import com.example.gymhelper.model.Manager;
import com.example.gymhelper.repo.ManagerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ManagerService {
    private final ManagerRepository managerRepository;
    public Manager getById(Long id) {
        return managerRepository.findById(id).orElseThrow(()-> new UserNotFoundException("Manager not found"));
    }

    public List<Manager> getAll() {
        return managerRepository.findAll();
    }
}
