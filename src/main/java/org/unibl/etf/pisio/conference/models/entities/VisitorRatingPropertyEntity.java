package org.unibl.etf.pisio.conference.models.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import org.unibl.etf.pisio.conference.base.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "visitor_rating_property")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")

public class VisitorRatingPropertyEntity implements BaseEntity<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "name", nullable = false, length = 255)
    private String name;
    @Basic
    @Column(name = "description", nullable = true, length = -1)
    private String description;
    @Basic
    @Column(name = "range_start", nullable = false)
    private Integer rangeStart;
    @Basic
    @Column(name = "range_end", nullable = false)
    private Integer rangeEnd;
    @OneToMany(mappedBy = "visitorRatingProperty")
    private List<AttendanceRatingEntity> attendanceRatings;
    @ManyToMany(mappedBy = "properties",fetch = FetchType.LAZY)
    private List<VisitorRatingSchemaEntity> schemas;

}
