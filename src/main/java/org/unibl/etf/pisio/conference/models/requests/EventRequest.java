package org.unibl.etf.pisio.conference.models.requests;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class EventRequest {
    private Integer id;
    private String name;
    private Boolean active;
    private Timestamp start;
    private Timestamp end;
    private String accessCode;
    private Integer locationId;
    private Integer sessionId;
    private Integer moderatorId;
    private Integer eventTypeId;
}
