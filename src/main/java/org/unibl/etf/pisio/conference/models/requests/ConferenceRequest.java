package org.unibl.etf.pisio.conference.models.requests;

import lombok.Data;

import java.util.Date;

@Data
public class ConferenceRequest {
    private String name;
    private Date start;
    private Date end;
    private String description;
    private Integer visitorRatingSchemaId;
}
