package org.unibl.etf.pisio.conference.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unibl.etf.pisio.conference.base.CrudController;
import org.unibl.etf.pisio.conference.models.Location;
import org.unibl.etf.pisio.conference.models.requests.LocationRequest;
import org.unibl.etf.pisio.conference.services.LocationService;

@RestController
@RequestMapping("/locations")
public class LocationController extends CrudController<Integer, LocationRequest, Location> {
    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        super(Location.class, locationService);
        this.locationService = locationService;
    }

}
