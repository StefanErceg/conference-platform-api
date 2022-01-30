package org.unibl.etf.pisio.conference.services.implementation;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.unibl.etf.pisio.conference.base.CrudJpaService;
import org.unibl.etf.pisio.conference.models.entities.CityEntity;
import org.unibl.etf.pisio.conference.repositories.CityEntityRepository;
import org.unibl.etf.pisio.conference.services.CityService;

@Service
@Transactional
public class CityServiceImpl extends CrudJpaService<CityEntity, Integer> implements CityService {
    private final ModelMapper modelMapper;
    private final CityEntityRepository repository;

    public CityServiceImpl(ModelMapper modelMapper, CityEntityRepository repository) {
        super(repository, CityEntity.class, modelMapper);
        this.modelMapper = modelMapper;
        this.repository = repository;
    }
}
