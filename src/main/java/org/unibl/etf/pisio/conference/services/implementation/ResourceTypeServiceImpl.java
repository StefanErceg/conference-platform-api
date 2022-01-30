package org.unibl.etf.pisio.conference.services.implementation;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.unibl.etf.pisio.conference.base.CrudJpaService;
import org.unibl.etf.pisio.conference.models.entities.ResourceTypeEntity;
import org.unibl.etf.pisio.conference.repositories.ResourceTypeEntityRepository;
import org.unibl.etf.pisio.conference.services.ResourceTypeService;

@Service
@Transactional
public class ResourceTypeServiceImpl extends CrudJpaService<ResourceTypeEntity, Integer> implements ResourceTypeService {
    private final ResourceTypeEntityRepository repository;
    private final ModelMapper modelMapper;

    public ResourceTypeServiceImpl(ResourceTypeEntityRepository repository, ModelMapper modelMapper) {
        super(repository, ResourceTypeEntity.class, modelMapper);
        this.repository = repository;
        this.modelMapper = modelMapper;
    }
}
