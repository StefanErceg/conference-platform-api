package org.unibl.etf.pisio.conference.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unibl.etf.pisio.conference.base.CrudController;
import org.unibl.etf.pisio.conference.models.EventType;
import org.unibl.etf.pisio.conference.models.requests.EventTypeRequest;
import org.unibl.etf.pisio.conference.services.EventTypeService;

@RestController
@RequestMapping("/event-types")
public class EventTypeController extends CrudController<Integer, EventTypeRequest, EventType> {

    private EventTypeService service;

    public EventTypeController(EventTypeService service) {
        super(EventType.class, service);
        this.service = service;
    }
}
