package org.unibl.etf.pisio.conference.services.implementation;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.unibl.etf.pisio.conference.base.CrudJpaService;
import org.unibl.etf.pisio.conference.models.Event;
import org.unibl.etf.pisio.conference.models.entities.EventEntity;
import org.unibl.etf.pisio.conference.repositories.EventEntityRepository;
import org.unibl.etf.pisio.conference.services.EventService;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class EventServiceImpl extends CrudJpaService<EventEntity, Integer> implements EventService {
    private EventEntityRepository repository;
    private ModelMapper modelMapper;

    public EventServiceImpl(EventEntityRepository repository, ModelMapper modelMapper) {
        super(repository, EventEntity.class, modelMapper);
        this.repository = repository;
        this.modelMapper = modelMapper;
    }


    @Override
    public List<Event> findBySession(Integer sessionId) {
        return repository.findAllBySessionId(sessionId).stream().map(e -> modelMapper.map(e, Event.class)).collect(Collectors.toList());
    }
}
