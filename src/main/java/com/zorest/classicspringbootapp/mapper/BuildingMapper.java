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
    public BuildingDto toDto(Building toEntity) {
        return null;
    }
}
