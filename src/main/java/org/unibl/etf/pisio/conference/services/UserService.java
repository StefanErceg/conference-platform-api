package org.unibl.etf.pisio.conference.services;

import org.unibl.etf.pisio.conference.models.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
}
