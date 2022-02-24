package org.unibl.etf.pisio.conference.services.implementation;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.unibl.etf.pisio.conference.base.CrudJpaService;
import org.unibl.etf.pisio.conference.models.entities.VisitorRatingPropertyEntity;
import org.unibl.etf.pisio.conference.repositories.VisitorRatingPropertyEntityRepository;
import org.unibl.etf.pisio.conference.services.VisitorRatingPropertyService;
@Service
@Transactional
public class VisitorRatingPropertyServiceImpl extends CrudJpaService<VisitorRatingPropertyEntity, Integer> implements VisitorRatingPropertyService {

    private VisitorRatingPropertyEntityRepository repository;
    private ModelMapper modelMapper;

    public VisitorRatingPropertyServiceImpl(VisitorRatingPropertyEntityRepository repository, ModelMapper modelMapper) {
        super(repository, VisitorRatingPropertyEntity.class, modelMapper);
        this.repository = repository;
        this.modelMapper = modelMapper;
    }
}
