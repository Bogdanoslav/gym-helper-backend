package com.example.gymhelper.rest;

import com.example.gymhelper.dto.GetClientProfile;
import com.example.gymhelper.dto.GetManagerProfile;
import com.example.gymhelper.mapper.ClientMapper;
import com.example.gymhelper.model.Client;
import com.example.gymhelper.model.Manager;
import com.example.gymhelper.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clients")
@AllArgsConstructor
public class ClientController {

    private final ClientService clientService;
    private final ClientMapper clientMapper;

    @GetMapping()
    @PreAuthorize("hasAnyRole('ADMIN','HR')")
    public ResponseEntity<?> index(){
        List<Client> clients = clientService.getAll();
        List<GetClientProfile> clientProfiles = clients.stream().map(clientMapper::clientToProfile).toList();
        return ResponseEntity.ok(clientProfiles);
    }
}
