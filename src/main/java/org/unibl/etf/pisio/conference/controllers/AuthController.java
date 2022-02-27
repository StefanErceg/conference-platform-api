package org.unibl.etf.pisio.conference.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.unibl.etf.pisio.conference.models.Login;
import org.unibl.etf.pisio.conference.models.requests.LoginRequest;
import org.unibl.etf.pisio.conference.services.AuthService;

@CrossOrigin
@RestController
public class AuthController {
    private final AuthService service;

    public AuthController(AuthService service) {
        this.service = service;
    }

    @PostMapping("/login")
    public Login login(@RequestBody LoginRequest request) {
        return service.login(request);
    }
}
