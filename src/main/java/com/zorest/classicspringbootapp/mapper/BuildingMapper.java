package com.zorest.classicspringbootapp.mapper;

import com.zorest.classicspringbootapp.dto.BuildingDto;
import com.zorest.classicspringbootapp.entity.Building;
import org.springframework.stereotype.Component;

@Component
public class BuildingMapper implements EntityMapper<Building, BuildingDto> {

    @Override
    public Building toEntity(BuildingDto dto) {
        Building entity = new Building();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setFloors(dto.getFloors());
        return entity;
    }

    @Override
    public BuildingDto toDto(Building entity) {
        BuildingDto dto = new BuildingDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setFloors(entity.getFloors());
        return dto;
    }
}
