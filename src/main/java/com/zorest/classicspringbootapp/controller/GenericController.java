package com.zorest.classicspringbootapp.controller;

import com.zorest.classicspringbootapp.service.GenericService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public abstract class GenericController<E, D, I, R extends CrudRepository<E, I>> {

    protected final GenericService<D, I> service;

    protected GenericController(GenericService<D, I> service) {
        this.service = service;
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    protected ResponseEntity<D> get(@PathVariable I id) {
        return ResponseEntity.ok(this.service.findById(id));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    protected ResponseEntity<Iterable<D>> getAll() {
        return ResponseEntity.ok(this.service.findAll());
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    protected ResponseEntity<D> post(@RequestBody D dto) {
        return ResponseEntity.ok(this.service.save(dto));
    }

}
