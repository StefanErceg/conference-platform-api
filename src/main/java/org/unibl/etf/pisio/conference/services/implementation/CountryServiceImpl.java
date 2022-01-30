package org.unibl.etf.pisio.conference.services.implementation;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.unibl.etf.pisio.conference.base.CrudJpaService;
import org.unibl.etf.pisio.conference.models.entities.CountryEntity;
import org.unibl.etf.pisio.conference.repositories.CountryEntityRepository;
import org.unibl.etf.pisio.conference.services.CountryService;

@Service
@Transactional
public class CountryServiceImpl extends CrudJpaService<CountryEntity, Integer> implements CountryService {
    private final ModelMapper modelMapper;
    private final CountryEntityRepository repository;

    public CountryServiceImpl(ModelMapper modelMapper, CountryEntityRepository repository) {
        super(repository, CountryEntity.class, modelMapper);
        this.modelMapper = modelMapper;
        this.repository = repository;
    }
}
