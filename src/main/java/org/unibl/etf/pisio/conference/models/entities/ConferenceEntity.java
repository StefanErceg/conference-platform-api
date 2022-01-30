package org.unibl.etf.pisio.conference.models.entities;

import lombok.Data;
import org.unibl.etf.pisio.conference.base.BaseEntity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Data
@Entity
@Table(name = "conference")
public class ConferenceEntity implements BaseEntity<Integer> {
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
    @Column(name = "description", nullable = true, length = -1)
    private String description;
    @OneToMany(mappedBy = "conference")
    private List<AttendanceEntity> attendances;
    @ManyToOne
    @JoinColumn(name = "visitor_rating_schema_id", referencedColumnName = "id", nullable = false)
    private VisitorRatingSchemaEntity visitorRatingSchema;
    @OneToMany(mappedBy = "conference")
    private List<SessionEntity> sessions;

}
