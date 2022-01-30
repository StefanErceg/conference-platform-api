package org.unibl.etf.pisio.conference.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unibl.etf.pisio.conference.base.CrudController;
import org.unibl.etf.pisio.conference.models.ResourceType;
import org.unibl.etf.pisio.conference.models.requests.ResourceTypeRequest;
import org.unibl.etf.pisio.conference.services.ResourceTypeService;

@RestController
@RequestMapping("resource-types")
public class ResourceTypeController extends CrudController<Integer, ResourceTypeRequest, ResourceType> {
    private final ResourceTypeService service;

    public ResourceTypeController(ResourceTypeService service) {
        super(ResourceType.class, service);
        this.service = service;
    }
}
