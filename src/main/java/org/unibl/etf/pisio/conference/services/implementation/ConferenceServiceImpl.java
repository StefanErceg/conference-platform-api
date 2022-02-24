package org.unibl.etf.pisio.conference.services.implementation;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.unibl.etf.pisio.conference.base.CrudJpaService;
import org.unibl.etf.pisio.conference.models.entities.ConferenceEntity;
import org.unibl.etf.pisio.conference.repositories.ConferenceEntityRepository;
import org.unibl.etf.pisio.conference.services.ConferenceService;

@Service
@Transactional
public class ConferenceServiceImpl extends CrudJpaService<ConferenceEntity, Integer> implements ConferenceService {
    private ConferenceEntityRepository repository;
    private ModelMapper modelMapper;

    public ConferenceServiceImpl(ConferenceEntityRepository repository, ModelMapper modelMapper) {
        super(repository, ConferenceEntity.class, modelMapper);
    }
}
