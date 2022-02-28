package org.unibl.etf.pisio.conference.controllers.client;

import org.springframework.web.bind.annotation.*;
import org.unibl.etf.pisio.conference.models.client.ClientEvent;
import org.unibl.etf.pisio.conference.services.ClientEventService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/event-list")
public class ClientEventController {
    private final ClientEventService service;

    public ClientEventController(ClientEventService service) {
        this.service = service;
    }

    @GetMapping
    List<ClientEvent> getAll(@RequestParam Integer conferenceId) {
        return service.findAllByConferenceId(conferenceId);
    }
}
