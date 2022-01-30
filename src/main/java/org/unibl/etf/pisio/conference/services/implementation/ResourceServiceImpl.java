package org.unibl.etf.pisio.conference.services.implementation;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.unibl.etf.pisio.conference.base.CrudJpaService;
import org.unibl.etf.pisio.conference.models.entities.ResourceEntity;
import org.unibl.etf.pisio.conference.repositories.ResourceEntityRepository;
import org.unibl.etf.pisio.conference.services.ResourceService;

@Service
@Transactional
public class ResourceServiceImpl extends CrudJpaService<ResourceEntity, Integer> implements ResourceService {
    private final ResourceEntityRepository repository;
    private final ModelMapper modelMapper;

    public ResourceServiceImpl(ResourceEntityRepository repository, ModelMapper modelMapper) {
        super(repository, ResourceEntity.class, modelMapper);
        this.repository = repository;
        this.modelMapper = modelMapper;
    }
}
