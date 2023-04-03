package com.example.gymhelper.mapper;

import com.example.gymhelper.dto.GetManagerProfile;
import com.example.gymhelper.model.Manager;
import org.mapstruct.Mapper;

@Mapper
public interface ManagerMapper {
    GetManagerProfile managerToProfile(Manager manager);
}
