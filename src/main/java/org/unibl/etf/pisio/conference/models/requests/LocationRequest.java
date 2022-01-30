package org.unibl.etf.pisio.conference.models.requests;

import lombok.Data;

@Data
public class LocationRequest {
    private String name;
    private String address;
    private Boolean active;
    private String room;
    private Integer cityId;
    private Integer locationTypeId;
}
