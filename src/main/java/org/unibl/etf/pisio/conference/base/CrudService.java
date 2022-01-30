package org.unibl.etf.pisio.conference.base;

import org.unibl.etf.pisio.conference.exceptions.NotFoundException;

import java.io.Serializable;
import java.util.List;

public interface CrudService<ID extends Serializable> {

    <T> List<T> findAll(Class<T> resultClass);

    <T> T findById(ID id, Class<T> resultClass) throws NotFoundException;

    <T, U> T insert(U data, Class<T> resultClass);

    <T, U> T update(ID id, U data, Class<T> resultClass);

    void delete(ID id) throws NotFoundException;
}
