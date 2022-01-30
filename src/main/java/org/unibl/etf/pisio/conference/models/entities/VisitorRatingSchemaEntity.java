package org.unibl.etf.pisio.conference.models.entities;

import lombok.Data;
import org.unibl.etf.pisio.conference.base.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "visitor_rating_schema")
public class VisitorRatingSchemaEntity implements BaseEntity<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @OneToMany(mappedBy = "visitorRatingSchema")
    private List<ConferenceEntity> conferences;
    @OneToMany(mappedBy = "visitorRatingSchema")
    private List<VisitorRatingSchemaHasVisitorRatingPropertyEntity> visitorRatingSchemaHasVisitorRatingProperties;

}
