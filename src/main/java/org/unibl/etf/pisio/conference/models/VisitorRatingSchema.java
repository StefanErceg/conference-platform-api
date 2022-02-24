package org.unibl.etf.pisio.conference.models;

import lombok.Data;

import java.util.List;

@Data
public class VisitorRatingSchema {
    private Integer id;
    private String name;
    private List<VisitorRatingProperty> properties;
}
