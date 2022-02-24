package org.unibl.etf.pisio.conference.models;

import lombok.Data;

@Data
public class VisitorRatingProperty {
    private Integer id;
    private String name;
    private String description;
    private Integer rangeStart;
    private Integer rangeEnd;
}
