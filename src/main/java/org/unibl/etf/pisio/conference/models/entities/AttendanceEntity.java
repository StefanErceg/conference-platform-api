package org.unibl.etf.pisio.conference.models.entities;

import lombok.Data;
import org.unibl.etf.pisio.conference.base.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "attendance")
public class AttendanceEntity implements BaseEntity<AttendanceEntityKey> {
    @EmbeddedId
    private AttendanceEntityKey id;

    @ManyToOne
    @JoinColumn(name = "visitor_id", referencedColumnName = "id", nullable = false)
    @MapsId("visitorId")
    private VisitorEntity visitor;
    @ManyToOne
    @JoinColumn(name = "conference_id", referencedColumnName = "id", nullable = false)
    @MapsId("conferenceId")
    private ConferenceEntity conference;
    @OneToMany(mappedBy = "attendance")
    private List<AttendanceRatingEntity> attendanceRatings;

}

@Embeddable
@Data
class AttendanceEntityKey implements Serializable {
    @Column(name = "visitor_id")
    private Integer visitorId;

    @Column(name = "conference_id")
    private Integer conferenceId;
}