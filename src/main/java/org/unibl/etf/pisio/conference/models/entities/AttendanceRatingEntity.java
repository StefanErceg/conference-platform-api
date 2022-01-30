package org.unibl.etf.pisio.conference.models.entities;

import lombok.Data;
import org.unibl.etf.pisio.conference.base.BaseEntity;

import javax.persistence.*;

@Data
@Entity
@Table(name = "attendance_rating")
public class AttendanceRatingEntity implements BaseEntity<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "rating", nullable = true)
    private Integer rating;
    @ManyToOne
    @JoinColumns({@JoinColumn(name = "attendance_visitor_id", referencedColumnName = "visitor_id", nullable = false),
            @JoinColumn(name = "attendance_conference_id", referencedColumnName = "conference_id", nullable = false)})
    private AttendanceEntity attendance;
    @ManyToOne
    @JoinColumn(name = "visitor_rating_property_id", referencedColumnName = "id", nullable = false)
    private VisitorRatingPropertyEntity visitorRatingProperty;

}
