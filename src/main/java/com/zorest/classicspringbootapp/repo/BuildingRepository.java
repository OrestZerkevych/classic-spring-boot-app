package com.zorest.classicspringbootapp.repo;

import com.zorest.classicspringbootapp.entity.Building;
import org.springframework.data.repository.CrudRepository;

public interface BuildingRepository extends CrudRepository<Building, Integer> {
}
