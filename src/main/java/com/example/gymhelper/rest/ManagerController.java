package com.example.gymhelper.rest;

import com.example.gymhelper.dto.GetManagerProfile;
import com.example.gymhelper.dto.GetParamedicProfile;
import com.example.gymhelper.dto.UpdateManagerProfile;
import com.example.gymhelper.mapper.ManagerMapper;
import com.example.gymhelper.model.Manager;
import com.example.gymhelper.model.Paramedic;
import com.example.gymhelper.model.UserCredentials;
import com.example.gymhelper.service.ManagerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/managers")
@AllArgsConstructor
public class ManagerController {
    private final ManagerService managerService;
    private final ManagerMapper managerMapper;

    @GetMapping("/profile")
    @PreAuthorize("hasAnyRole('ADMIN','MANAGER')")
    public ResponseEntity<?> profile(@AuthenticationPrincipal UserCredentials userCredentials){
        Manager manager = managerService.getById(userCredentials.getId());
        GetManagerProfile managerProfile = managerMapper.managerToProfile(manager);
        return ResponseEntity.ok(managerProfile);
    }

    @GetMapping()
    @PreAuthorize("hasAnyRole('ADMIN','HR')")
    public ResponseEntity<?> index(){
        List<Manager> managers = managerService.getAll();
        List<GetManagerProfile> managerProfiles = managers.stream().map(managerMapper::managerToProfile).toList();
        return ResponseEntity.ok(managerProfiles);
    }

}
