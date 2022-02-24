package org.unibl.etf.pisio.conference.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unibl.etf.pisio.conference.base.CrudController;
import org.unibl.etf.pisio.conference.models.VisitorRatingProperty;
import org.unibl.etf.pisio.conference.models.requests.VisitorRatingPropertyRequest;
import org.unibl.etf.pisio.conference.services.VisitorRatingPropertyService;

@RestController
@RequestMapping("/rating-properties")
public class VisitorRatingPropertyController extends CrudController<Integer, VisitorRatingPropertyRequest, VisitorRatingProperty> {
    private VisitorRatingPropertyService service;

    public VisitorRatingPropertyController(VisitorRatingPropertyService service) {
        super(VisitorRatingProperty.class, service);
        this.service = service;
    }
}
