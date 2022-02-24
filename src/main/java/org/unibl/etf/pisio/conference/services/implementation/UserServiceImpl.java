package org.unibl.etf.pisio.conference.services.implementation;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.unibl.etf.pisio.conference.models.User;
import org.unibl.etf.pisio.conference.repositories.UserEntityRepository;
import org.unibl.etf.pisio.conference.services.UserService;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserEntityRepository repository;
    private final ModelMapper modelMapper;

    public UserServiceImpl(UserEntityRepository repository, ModelMapper modelMapper) {
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<User> findAll() {
        return repository.findAll().stream().map(e -> modelMapper.map(e, User.class)).collect(Collectors.toList());
    }
}
