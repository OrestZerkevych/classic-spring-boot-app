package com.zorest.classicspringbootapp.service;

public interface GenericService<D, I> {

    D save(final D dto);

    Iterable<D> saveAll(final Iterable<D> dtos);

    D findById(final I id);

    Iterable<D> findAll();

}
