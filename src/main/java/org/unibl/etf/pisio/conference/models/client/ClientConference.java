package org.unibl.etf.pisio.conference.models.client;

import lombok.Data;
import org.unibl.etf.pisio.conference.models.VisitorRatingSchema;

import java.util.Date;

@Data
public class ClientConference {
    private Integer id;
    private String name;
    private Date start;
    private Date end;
    private String description;
    private VisitorRatingSchema ratingSchema;
}
