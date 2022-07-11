package com.zorest.classicspringbootapp.controller;

import com.zorest.classicspringbootapp.dto.BuildingDto;
import com.zorest.classicspringbootapp.entity.Building;
import com.zorest.classicspringbootapp.service.GenericService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/buildings")
public class BuildingControllerV1
        extends GenericController<Building, BuildingDto, Integer, CrudRepository<Building, Integer>> {

    protected BuildingControllerV1(@Qualifier("buildingService") GenericService<BuildingDto, Integer> service) {
        super(service);
    }

}
