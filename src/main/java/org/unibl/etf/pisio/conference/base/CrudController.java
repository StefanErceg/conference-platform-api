package org.unibl.etf.pisio.conference.base;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.unibl.etf.pisio.conference.exceptions.NotFoundException;

import java.io.Serializable;
import java.util.List;

@Getter
public abstract class CrudController<ID extends Serializable, REQUEST, RESPONSE> {

    private final Class<RESPONSE> responseClass;
    private final CrudService<ID> crudService;

    public CrudController(Class<RESPONSE> responseClass, CrudService<ID> crudService) {
        this.responseClass = responseClass;
        this.crudService = crudService;
    }

    @GetMapping
    List<RESPONSE> findAll() {
        return crudService.findAll(responseClass);
    }

    @GetMapping("/{id}")
    public RESPONSE findById(@PathVariable ID id) throws NotFoundException {
        return crudService.findById(id, responseClass);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RESPONSE insert(@RequestBody REQUEST data) {
        return crudService.insert(data, responseClass);
    }

    @PutMapping("/{id}")
    public RESPONSE update(@PathVariable ID id, @RequestBody REQUEST data) throws NotFoundException {
        return crudService.update(id, data, responseClass);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable ID id) throws NotFoundException {
        crudService.delete(id);
    }

}
