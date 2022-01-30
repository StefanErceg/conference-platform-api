package org.unibl.etf.pisio.conference.models.entities;

import lombok.Data;
import org.unibl.etf.pisio.conference.base.BaseEntity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Data
@Entity
@Table(name = "event")
public class EventEntity implements BaseEntity<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "name", nullable = false, length = 255)
    private String name;
    @Basic
    @Column(name = "active", nullable = false)
    private Boolean active;
    @Basic
    @Column(name = "start", nullable = false)
    private Timestamp start;
    @Basic
    @Column(name = "end", nullable = true)
    private Timestamp end;
    @Basic
    @Column(name = "access_code", nullable = true, length = 255)
    private String accessCode;
    @ManyToOne
    @JoinColumn(name = "location_id", referencedColumnName = "id", nullable = false)
    private LocationEntity location;
    @ManyToOne
    @JoinColumn(name = "session_id", referencedColumnName = "id")
    private SessionEntity session;
    @ManyToOne
    @JoinColumn(name = "moderator_id", referencedColumnName = "id", nullable = false)
    private UserEntity moderator;
    @ManyToOne
    @JoinColumn(name = "event_type_id", referencedColumnName = "id", nullable = false)
    private EventTypeEntity eventType;
    @OneToMany(mappedBy = "event")
    private List<EventHasResourceEntity> eventHasResources;

}
