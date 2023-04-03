package com.example.gymhelper.rest;

import com.example.gymhelper.dto.GetHrProfile;
import com.example.gymhelper.dto.GetManagerProfile;
import com.example.gymhelper.mapper.HrMapper;
import com.example.gymhelper.model.HrSpecialist;
import com.example.gymhelper.model.Manager;
import com.example.gymhelper.model.UserCredentials;
import com.example.gymhelper.service.HrService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hrs")
@AllArgsConstructor
public class HrController {

    private final HrService hrService;
    private final HrMapper hrMapper;

    @GetMapping("/profile")
    @PreAuthorize("hasAnyRole('ADMIN','MANAGER')")
    public ResponseEntity<?> profile(@AuthenticationPrincipal UserCredentials userCredentials){
        HrSpecialist hrSpecialist = hrService.getById(userCredentials.getId());
        GetHrProfile hrProfile = hrMapper.hrToProfile(hrSpecialist);
        return ResponseEntity.ok(hrProfile);
    }
}
