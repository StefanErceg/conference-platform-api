package org.unibl.etf.pisio.conference.models.requests;

import lombok.Data;

@Data
public class VisitorRatingPropertyRequest {
    private String name;
    private String description;
    private Integer rangeStart;
    private Integer rangeEnd;
}
