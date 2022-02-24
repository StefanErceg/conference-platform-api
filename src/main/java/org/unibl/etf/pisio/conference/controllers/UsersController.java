package org.unibl.etf.pisio.conference.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unibl.etf.pisio.conference.models.User;
import org.unibl.etf.pisio.conference.services.UserService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UsersController {
    private final UserService service;

    public UsersController(UserService service) {
        this.service = service;
    }

    @GetMapping
    List<User> getAll() {
        return service.findAll();
    }
}
