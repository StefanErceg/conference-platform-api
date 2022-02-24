package org.unibl.etf.pisio.conference.models;

import lombok.Data;
import java.sql.Timestamp;
import java.util.List;

@Data
public class Session {
    private Integer id;
    private String name;
    private Timestamp start;
    private Timestamp end;
    private Boolean active;
    private Integer conferenceId;
    private User moderator;
    private List<Event> events;
}
