package org.unibl.etf.pisio.conference.models.requests;

import lombok.Data;

@Data
public class ResourceRequest {
    private String name;
    private String identifier;
    private String description;
    private Integer resourceTypeId;
}
