package org.unibl.etf.pisio.conference.models.requests;

import lombok.Data;
import org.unibl.etf.pisio.conference.models.Event;

import java.sql.Timestamp;
import java.util.List;

@Data
public class SessionRequest {
    private Integer id;
    private String name;
    private Timestamp start;
    private Timestamp end;
    private Boolean active;
    private Integer conferenceId;
    private Integer moderatorId;
    private List<Event> events;
}
