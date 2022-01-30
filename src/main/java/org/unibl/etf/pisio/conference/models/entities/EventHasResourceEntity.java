package org.unibl.etf.pisio.conference.models.entities;

import lombok.Data;
import org.unibl.etf.pisio.conference.base.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "event_has_resource")
public class EventHasResourceEntity implements BaseEntity<EventHasResourceEntityKey> {
    @EmbeddedId
    private EventHasResourceEntityKey id;
    @Basic
    @Column(name = "start", nullable = false)
    private Timestamp start;
    @Basic
    @Column(name = "end", nullable = false)
    private Timestamp end;
    @ManyToOne
    @JoinColumn(name = "event_id", referencedColumnName = "id", nullable = false)
    @MapsId("eventId")
    private EventEntity event;
    @ManyToOne
    @JoinColumn(name = "resource_id", referencedColumnName = "id", nullable = false)
    @MapsId("resourceId")
    private ResourceEntity resource;

}

@Embeddable
@Data
class EventHasResourceEntityKey implements Serializable {
    @Column(name = "event_id")
    private Integer eventId;

    @Column(name = "resource_id")
    private Integer resourceId;
}