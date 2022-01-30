package org.unibl.etf.pisio.conference.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unibl.etf.pisio.conference.base.CrudController;
import org.unibl.etf.pisio.conference.models.Resource;
import org.unibl.etf.pisio.conference.models.requests.ResourceRequest;
import org.unibl.etf.pisio.conference.services.ResourceService;

@RestController
@RequestMapping("/resources")
public class ResourceController extends CrudController<Integer, ResourceRequest, Resource> {
    private ResourceService service;

    public ResourceController(ResourceService service) {
        super(Resource.class, service);
        this.service = service;
    }
}
