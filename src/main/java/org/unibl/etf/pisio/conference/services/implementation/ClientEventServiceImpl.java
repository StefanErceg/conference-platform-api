package org.unibl.etf.pisio.conference.services.implementation;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.unibl.etf.pisio.conference.models.client.ClientEvent;
import org.unibl.etf.pisio.conference.repositories.EventEntityRepository;
import org.unibl.etf.pisio.conference.services.ClientEventService;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ClientEventServiceImpl implements ClientEventService {
    private final EventEntityRepository repository;
    private final ModelMapper modelMapper;

    public ClientEventServiceImpl(EventEntityRepository repository, ModelMapper modelMapper) {
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<ClientEvent> findAllByConferenceId(Integer conferenceId) {
        return repository.findAllBySession_Conference_Id(conferenceId).stream().map(e -> modelMapper.map(e, ClientEvent.class)).collect(Collectors.toList());
    }
}
