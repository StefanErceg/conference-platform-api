package org.unibl.etf.pisio.conference.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.unibl.etf.pisio.conference.base.CrudController;
import org.unibl.etf.pisio.conference.models.Session;
import org.unibl.etf.pisio.conference.models.requests.SessionRequest;
import org.unibl.etf.pisio.conference.services.SessionService;

import java.util.List;

@RestController
@RequestMapping("/sessions")
public class SessionController extends CrudController<Integer, SessionRequest, Session> {
    private SessionService service;

    public SessionController(SessionService service) {
        super(Session.class, service);
        this.service = service;
    }

    @GetMapping("/filter")
    public List<Session> getByConference(@RequestParam Integer conferenceId) {
        return service.findByConference(conferenceId);
    }
}
