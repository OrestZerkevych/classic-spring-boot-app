package com.zorest.classicspringbootapp.service;

import com.zorest.classicspringbootapp.mapper.EntityMapper;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.EntityNotFoundException;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public abstract class GenericServiceImpl<E, D, I, R extends CrudRepository<E, I>> implements GenericService<D, I> {

    protected final R repository;
    protected final EntityMapper<E, D> mapper;

    public GenericServiceImpl(R repository, EntityMapper<E, D> mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public D save(D dto) {
        E entity = mapper.toEntity(dto);
        E saved = repository.save(entity);
        return mapper.toDto(saved);
    }

    @Override
    public Iterable<D> saveAll(Iterable<D> dtos) {
        Iterable<E> entities =
                StreamSupport
                        .stream(dtos.spliterator(), false)
                        .map(mapper::toEntity)
                        .collect(Collectors.toList());

        Iterable<E> saved = repository.saveAll(entities);
        return StreamSupport
                .stream(saved.spliterator(), false)
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public D findById(I id) {
        return repository
                .findById(id)
                .map(mapper::toDto)
                .orElseThrow(() -> new EntityNotFoundException(String.format("No entity found by ID %s", id)));
    }

    @Override
    public Iterable<D> findAll() {
        return StreamSupport
                .stream(repository.findAll().spliterator(), false)
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }
}
