package org.unibl.etf.pisio.conference.services.implementation;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.unibl.etf.pisio.conference.base.CrudJpaService;
import org.unibl.etf.pisio.conference.exceptions.NotFoundException;
import org.unibl.etf.pisio.conference.models.User;
import org.unibl.etf.pisio.conference.models.entities.UserEntity;
import org.unibl.etf.pisio.conference.repositories.UserEntityRepository;
import org.unibl.etf.pisio.conference.services.UserService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserServiceImpl extends CrudJpaService<UserEntity, Integer> implements UserService {

    private final UserEntityRepository repository;
    private final ModelMapper modelMapper;

    public UserServiceImpl(UserEntityRepository repository, ModelMapper modelMapper) {
        super(repository, UserEntity.class, modelMapper);
        this.repository = repository;
        this.modelMapper = modelMapper;
    }
}