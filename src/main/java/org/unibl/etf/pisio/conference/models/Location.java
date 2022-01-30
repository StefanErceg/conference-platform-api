package org.unibl.etf.pisio.conference.models;

import lombok.Data;

@Data
public class Location {
    private Integer id;
    private String name;
    private Boolean active;
    private String address;
    private String room;
    private City city;
    private String locationTypeName;
}
