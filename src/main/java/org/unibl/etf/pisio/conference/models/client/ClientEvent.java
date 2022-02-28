package org.unibl.etf.pisio.conference.models.client;

import lombok.Data;
import org.unibl.etf.pisio.conference.models.Location;

import java.sql.Timestamp;

@Data
public class ClientEvent {
    private String name;
    private Timestamp start;
    private Timestamp end;
    private Location location;
    private String eventTypeName;
}
