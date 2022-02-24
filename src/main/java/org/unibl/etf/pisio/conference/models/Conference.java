package org.unibl.etf.pisio.conference.models;

import lombok.Data;

import java.util.Date;

@Data
public class Conference {
    private Integer id;
    private String name;
    private Date start;
    private Date end;
    private String description;
    private Integer visitorRatingSchemaId;
}
