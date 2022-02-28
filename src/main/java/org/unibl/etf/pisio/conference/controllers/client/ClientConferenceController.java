package org.unibl.etf.pisio.conference.controllers.client;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unibl.etf.pisio.conference.models.client.ClientConference;
import org.unibl.etf.pisio.conference.services.ConferenceService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/conference-list")
public class ClientConferenceController{
    private ConferenceService service;

    public ClientConferenceController(ConferenceService service) {
        this.service = service;
    }

    @GetMapping
    List<ClientConference> getAll() {
        return service.findAll(ClientConference.class);
    }
}
