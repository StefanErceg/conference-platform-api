package org.unibl.etf.pisio.conference.services.implementation;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.unibl.etf.pisio.conference.base.CrudJpaService;
import org.unibl.etf.pisio.conference.models.entities.VisitorRatingSchemaEntity;
import org.unibl.etf.pisio.conference.repositories.VisitorRatingSchemaEntityRepository;
import org.unibl.etf.pisio.conference.services.VisitorRatingSchemaService;

@Service
@Transactional
public class VisitorRatingSchemaServiceImpl extends CrudJpaService<VisitorRatingSchemaEntity, Integer> implements VisitorRatingSchemaService {

    private VisitorRatingSchemaEntityRepository repository;
    private ModelMapper modelMapper;

    public VisitorRatingSchemaServiceImpl(VisitorRatingSchemaEntityRepository repository, ModelMapper modelMapper) {
        super(repository, VisitorRatingSchemaEntity.class, modelMapper);
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

}
