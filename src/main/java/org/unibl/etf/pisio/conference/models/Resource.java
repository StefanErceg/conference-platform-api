package org.unibl.etf.pisio.conference.models;

import lombok.Data;

@Data
public class Resource {
    private Integer id;
    private String name;
    private String identifier;
    private String description;
    private ResourceType resourceType;
}
