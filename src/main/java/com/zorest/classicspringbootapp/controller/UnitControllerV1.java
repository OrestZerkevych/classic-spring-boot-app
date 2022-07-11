package com.zorest.classicspringbootapp.controller;

import com.zorest.classicspringbootapp.dto.UnitDto;
import com.zorest.classicspringbootapp.entity.Unit;
import com.zorest.classicspringbootapp.service.GenericService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/units")
public class UnitControllerV1
        extends GenericController<Unit, UnitDto, Integer, CrudRepository<Unit, Integer>> {

    protected UnitControllerV1(@Qualifier("unitService") GenericService<UnitDto, Integer> service) {
        super(service);
    }
}
