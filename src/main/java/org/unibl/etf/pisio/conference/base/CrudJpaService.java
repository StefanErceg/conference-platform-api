package org.unibl.etf.pisio.conference.base;

import lombok.Getter;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.unibl.etf.pisio.conference.exceptions.NotFoundException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

@Transactional
@Getter
public class CrudJpaService<E extends BaseEntity<ID>, ID extends Serializable> implements CrudService<ID> {

    private final JpaRepository<E, ID> repository;
    private final Class<E> entityClass;
    private final ModelMapper modelMapper;
    @PersistenceContext
    private EntityManager entityManager;

    public CrudJpaService(JpaRepository<E, ID> repository, Class<E> entityClass, ModelMapper modelMapper) {
        this.repository = repository;
        this.entityClass = entityClass;
        this.modelMapper = modelMapper;
    }

    @Override
    public <T> List<T> findAll(Class<T> resultClass) {
        return repository.findAll().stream().map(e -> modelMapper.map(e, resultClass)).collect(Collectors.toList());
    }

    public <T> Page<T> findAll(Pageable page, Class<T> resultClass) {
        return repository.findAll(page).map(e -> modelMapper.map(e, resultClass));
    }

    @Override
    public <T> T findById(ID id, Class<T> resultClass) throws NotFoundException {
        return modelMapper.map(findEntityById(id), resultClass);
    }

    @Override
    public <T, U> T insert(U data, Class<T> resultClass) {
        System.out.println(data);
        E entity = modelMapper.map(data, entityClass);
        entity.setId(null);
        entity = repository.saveAndFlush(entity);
        entityManager.refresh(entity);
        return modelMapper.map(entity, resultClass);
    }

    @Override
    public <T, U> T update(ID id, U data, Class<T> resultClass) {
        if (!repository.existsById(id)) {
            throw new NotFoundException();
        }
        E entity = modelMapper.map(data, entityClass);
        entity.setId(id);
        entity = repository.saveAndFlush(entity);
        entityManager.refresh(entity);
        return modelMapper.map(entity, resultClass);
    }

    @Override
    public void delete(ID id) throws NotFoundException {
        if (!repository.existsById(id)) {
            throw new NotFoundException();
        }
        repository.deleteById(id);
    }

    public E findEntityById(ID id) {
        return repository.findById(id).orElseThrow(NotFoundException::new);
    }
}
