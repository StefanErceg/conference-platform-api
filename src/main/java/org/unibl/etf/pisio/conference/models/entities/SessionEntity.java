package org.unibl.etf.pisio.conference.models.entities;

import lombok.Data;
import org.unibl.etf.pisio.conference.base.BaseEntity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Data
@Entity
@Table(name = "session")
public class SessionEntity implements BaseEntity<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "name", nullable = true, length = 255)
    private String name;
    @Basic
    @Column(name = "start", nullable = false)
    private Timestamp start;
    @Basic
    @Column(name = "end", nullable = true)
    private Timestamp end;
    @Basic
    @Column(name = "active", nullable = true)
    private Boolean active;
    @OneToMany(mappedBy = "session")
    private List<EventEntity> events;
    @ManyToOne
    @JoinColumn(name = "conference_id", referencedColumnName = "id", nullable = false)
    private ConferenceEntity conference;
    @ManyToOne
    @JoinColumn(name = "moderator_id", referencedColumnName = "id", nullable = false)
    private UserEntity moderator;

}
