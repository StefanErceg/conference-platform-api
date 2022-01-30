package org.unibl.etf.pisio.conference.services.implementation;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.unibl.etf.pisio.conference.base.CrudJpaService;
import org.unibl.etf.pisio.conference.models.entities.LocationEntity;
import org.unibl.etf.pisio.conference.repositories.LocationEntityRepository;
import org.unibl.etf.pisio.conference.services.LocationService;

@Service
@Transactional
public class LocationServiceImpl extends CrudJpaService<LocationEntity, Integer> implements LocationService {
    private final LocationEntityRepository repository;
    private final ModelMapper modelMapper;

    public LocationServiceImpl(LocationEntityRepository repository, ModelMapper modelMapper) {
        super(repository, LocationEntity.class, modelMapper);
        this.repository = repository;
        this.modelMapper = modelMapper;
    }
}
