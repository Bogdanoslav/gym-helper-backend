package com.example.gymhelper.mapper;

import com.example.gymhelper.dto.GetTrainerProfile;
import com.example.gymhelper.model.Trainer;
import org.mapstruct.Mapper;

@Mapper
public interface TrainerMapper {
    GetTrainerProfile trainerToProfile(Trainer trainer);
}
