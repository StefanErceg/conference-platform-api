package org.unibl.etf.pisio.conference.models;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Event {
    private Integer id;
    private String name;
    private Boolean active;
    private Timestamp start;
    private Timestamp end;
    private String accessCode;
    private Location location;
    private Integer sessionId;
    private User moderator;
    private EventType eventType;
}
