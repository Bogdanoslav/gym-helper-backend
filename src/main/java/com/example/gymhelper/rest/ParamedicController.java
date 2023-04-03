package com.example.gymhelper.rest;

import com.example.gymhelper.dto.GetParamedicProfile;
import com.example.gymhelper.dto.GetTrainerProfile;
import com.example.gymhelper.mapper.ParamedicMapper;
import com.example.gymhelper.mapper.TrainerMapper;
import com.example.gymhelper.model.Paramedic;
import com.example.gymhelper.model.Trainer;
import com.example.gymhelper.service.ParamedicService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/paramedics")
@AllArgsConstructor
public class ParamedicController {
    private final ParamedicService paramedicService;

    private final ParamedicMapper paramedicMapper;

    @GetMapping()
    @PreAuthorize("hasAnyRole('ADMIN','HR')")
    public ResponseEntity<?> index(){
        List<Paramedic> paramedics = paramedicService.getAll();
        List<GetParamedicProfile> paramedicProfiles = paramedics.stream().map(paramedicMapper::paramedicToProfile).toList();
        return ResponseEntity.ok(paramedicProfiles);
    }
}
