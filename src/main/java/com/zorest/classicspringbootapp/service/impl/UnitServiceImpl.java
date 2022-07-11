package com.zorest.classicspringbootapp.service.impl;

import com.zorest.classicspringbootapp.dto.UnitDto;
import com.zorest.classicspringbootapp.entity.Unit;
import com.zorest.classicspringbootapp.mapper.EntityMapper;
import com.zorest.classicspringbootapp.repo.UnitRepository;
import com.zorest.classicspringbootapp.service.GenericServiceImpl;
import com.zorest.classicspringbootapp.service.UnitService;
import org.springframework.stereotype.Service;

@Service(value="unitService")
public class UnitServiceImpl extends GenericServiceImpl<Unit, UnitDto, Integer, UnitRepository> implements UnitService {

    public UnitServiceImpl(UnitRepository repository, EntityMapper<Unit, UnitDto> mapper) {
        super(repository, mapper);
    }

}
