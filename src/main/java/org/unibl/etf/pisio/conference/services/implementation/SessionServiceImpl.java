package org.unibl.etf.pisio.conference.services.implementation;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.unibl.etf.pisio.conference.base.CrudJpaService;
import org.unibl.etf.pisio.conference.models.Session;
import org.unibl.etf.pisio.conference.models.entities.SessionEntity;
import org.unibl.etf.pisio.conference.repositories.SessionEntityRepository;
import org.unibl.etf.pisio.conference.services.SessionService;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class SessionServiceImpl extends CrudJpaService<SessionEntity, Integer> implements SessionService {
    private SessionEntityRepository repository;
    private ModelMapper modelMapper;

    public SessionServiceImpl(SessionEntityRepository repository, ModelMapper modelMapper) {
        super(repository,SessionEntity.class, modelMapper);
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<Session> findByConference(Integer conferenceId) {
        return repository.findAllByConference_Id(conferenceId).stream().map(e -> modelMapper.map(e, Session.class)).collect(Collectors.toList());
    }

}
