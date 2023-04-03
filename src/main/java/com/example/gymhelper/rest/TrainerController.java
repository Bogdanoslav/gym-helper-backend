package com.example.gymhelper.rest;

import com.example.gymhelper.dto.GetTrainerProfile;
import com.example.gymhelper.mapper.TrainerMapper;
import com.example.gymhelper.model.Trainer;
import com.example.gymhelper.service.TrainerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/trainers")
@AllArgsConstructor
public class TrainerController {
    private final TrainerService trainerService;
    private final TrainerMapper trainerMapper;

    @GetMapping()
    @PreAuthorize("hasAnyRole('ADMIN','HR')")
    public ResponseEntity<?> index(){
        List<Trainer> trainers = trainerService.getAll();
        List<GetTrainerProfile> trainerProfiles = trainers.stream().map(trainerMapper::trainerToProfile).toList();
        return ResponseEntity.ok(trainerProfiles);
    }
}
