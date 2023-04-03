package com.example.gymhelper.mapper;

import com.example.gymhelper.dto.GetParamedicProfile;
import com.example.gymhelper.model.Paramedic;
import org.mapstruct.Mapper;

@Mapper
public interface ParamedicMapper {
    GetParamedicProfile paramedicToProfile(Paramedic paramedic);
}
