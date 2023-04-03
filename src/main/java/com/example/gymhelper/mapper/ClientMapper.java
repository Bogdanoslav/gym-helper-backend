package com.example.gymhelper.mapper;

import com.example.gymhelper.dto.GetClientProfile;
import com.example.gymhelper.model.Client;
import org.mapstruct.Mapper;

@Mapper
public interface ClientMapper {
    GetClientProfile clientToProfile(Client client);
}
