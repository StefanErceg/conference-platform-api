package org.unibl.etf.pisio.conference.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unibl.etf.pisio.conference.base.CrudController;
import org.unibl.etf.pisio.conference.models.Conference;
import org.unibl.etf.pisio.conference.models.requests.ConferenceRequest;
import org.unibl.etf.pisio.conference.services.ConferenceService;

@RestController
@RequestMapping("/conferences")
public class ConferenceController extends CrudController<Integer, ConferenceRequest, Conference> {
    private ConferenceService service;

    public ConferenceController(ConferenceService service) {
        super(Conference.class, service);
        this.service = service;
    }

}
