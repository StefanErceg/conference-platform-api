package org.unibl.etf.pisio.conference.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unibl.etf.pisio.conference.base.CrudController;
import org.unibl.etf.pisio.conference.models.City;
import org.unibl.etf.pisio.conference.models.requests.CityRequest;
import org.unibl.etf.pisio.conference.services.CityService;

@RestController
@RequestMapping("cities")
public class CityController extends CrudController<Integer, CityRequest, City> {

    private final CityService cityService;

    public CityController(CityService cityService) {
        super(City.class, cityService);
        this.cityService = cityService;
    }
}
