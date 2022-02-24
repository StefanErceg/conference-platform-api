package org.unibl.etf.pisio.conference.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unibl.etf.pisio.conference.base.CrudController;
import org.unibl.etf.pisio.conference.models.VisitorRatingSchema;
import org.unibl.etf.pisio.conference.models.requests.VisitorRatingSchemaRequest;
import org.unibl.etf.pisio.conference.services.VisitorRatingSchemaService;

@RestController
@RequestMapping("/rating-schemas")
public class VisitorRatingSchemaController extends CrudController<Integer, VisitorRatingSchemaRequest, VisitorRatingSchema>{
    private VisitorRatingSchemaService service;

    public VisitorRatingSchemaController(VisitorRatingSchemaService service) {
        super(VisitorRatingSchema.class, service);
        this.service = service;
    }
}
