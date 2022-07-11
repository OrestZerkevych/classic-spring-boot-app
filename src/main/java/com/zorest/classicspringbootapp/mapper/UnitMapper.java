package com.zorest.classicspringbootapp.mapper;

import com.zorest.classicspringbootapp.dto.UnitDto;
import com.zorest.classicspringbootapp.entity.Unit;
import org.springframework.stereotype.Component;

@Component
public class UnitMapper implements EntityMapper<Unit, UnitDto> {

    @Override
    public Unit toEntity(UnitDto dto) {
        Unit entity = new Unit();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setPower(dto.getPower());
        return entity;
    }

    @Override
    public UnitDto toDto(Unit entity) {
        UnitDto dto = new UnitDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setPower(entity.getPower());
        return dto;
    }
}
