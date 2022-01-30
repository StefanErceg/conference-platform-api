package org.unibl.etf.pisio.conference.services.implementation;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.unibl.etf.pisio.conference.base.CrudJpaService;
import org.unibl.etf.pisio.conference.models.entities.EventTypeEntity;
import org.unibl.etf.pisio.conference.repositories.EventTypeEntityRepository;
import org.unibl.etf.pisio.conference.services.EventTypeService;

@Service
@Transactional
public class EventTypeServiceImpl extends CrudJpaService<EventTypeEntity, Integer> implements EventTypeService {
    private final ModelMapper modelMapper;
    private final EventTypeEntityRepository repository;

    public EventTypeServiceImpl(ModelMapper modelMapper, EventTypeEntityRepository repository) {
        super(repository, EventTypeEntity.class, modelMapper);
        this.modelMapper = modelMapper;
        this.repository = repository;
    }
}
