package org.unibl.etf.pisio.conference.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unibl.etf.pisio.conference.base.CrudController;
import org.unibl.etf.pisio.conference.models.Country;
import org.unibl.etf.pisio.conference.models.requests.CountryRequest;
import org.unibl.etf.pisio.conference.services.CountryService;

@RestController
@RequestMapping("/countries")
public class CountryController extends CrudController<Integer, CountryRequest, Country> {

    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        super(Country.class, countryService);
        this.countryService = countryService;
    }

}
