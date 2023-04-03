package com.example.gymhelper.mapper;

import com.example.gymhelper.dto.GetHrProfile;
import com.example.gymhelper.model.HrSpecialist;
import org.mapstruct.Mapper;

@Mapper
public interface HrMapper {

    GetHrProfile hrToProfile(HrSpecialist hrSpecialist);
}
