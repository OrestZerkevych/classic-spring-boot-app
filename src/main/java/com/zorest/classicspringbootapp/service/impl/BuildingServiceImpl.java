package com.zorest.classicspringbootapp.service.impl;

import com.zorest.classicspringbootapp.dto.BuildingDto;
import com.zorest.classicspringbootapp.entity.Building;
import com.zorest.classicspringbootapp.mapper.EntityMapper;
import com.zorest.classicspringbootapp.repo.BuildingRepository;
import com.zorest.classicspringbootapp.service.BuildingService;
import com.zorest.classicspringbootapp.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service(value="buildingService")
public class BuildingServiceImpl extends GenericServiceImpl<Building, BuildingDto, Integer, BuildingRepository> implements BuildingService {

    public BuildingServiceImpl(BuildingRepository repository, EntityMapper<Building, BuildingDto> mapper) {
        super(repository, mapper);
    }

}
