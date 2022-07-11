package com.zorest.classicspringbootapp.mapper;

public interface EntityMapper<E, D> {

    E toEntity(D dto);

    D toDto(E toEntity);

}
