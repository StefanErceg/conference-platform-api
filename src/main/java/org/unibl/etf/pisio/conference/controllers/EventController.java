package org.unibl.etf.pisio.conference.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.unibl.etf.pisio.conference.base.CrudController;
import org.unibl.etf.pisio.conference.models.Event;
import org.unibl.etf.pisio.conference.models.requests.EventRequest;
import org.unibl.etf.pisio.conference.services.EventService;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController extends CrudController<Integer, EventRequest, Event> {
    private EventService service;

    public EventController(EventService service) {
        super(Event.class, service);
        this.service = service;
    }
    @GetMapping("/filter")
    public List<Event> getBySession(@RequestParam Integer sessionId) {
        return service.findBySession(sessionId);
    }
}
