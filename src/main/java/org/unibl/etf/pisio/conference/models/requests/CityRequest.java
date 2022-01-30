package org.unibl.etf.pisio.conference.models.requests;

import lombok.Data;

@Data
public class CityRequest {
    private String name;
    private Integer countryId;
}
