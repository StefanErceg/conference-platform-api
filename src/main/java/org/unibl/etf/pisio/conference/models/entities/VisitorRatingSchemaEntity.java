package org.unibl.etf.pisio.conference.models.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import org.unibl.etf.pisio.conference.base.BaseEntity;
import org.unibl.etf.pisio.conference.models.VisitorRatingProperty;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "visitor_rating_schema")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")

public class VisitorRatingSchemaEntity implements BaseEntity<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "name", nullable = false, unique = true)
    private String name;
    @OneToMany(mappedBy = "visitorRatingSchema")
    private List<ConferenceEntity> conferences;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "visitor_rating_schema_has_visitor_rating_property",
            joinColumns = {
                    @JoinColumn(name = "visitor_rating_schema_id", referencedColumnName = "id",
                            nullable = false, updatable = false)},
            inverseJoinColumns = {
                    @JoinColumn(name = "visitor_rating_property_id", referencedColumnName = "id",
                            nullable = false, updatable = false)})
    private Set<VisitorRatingPropertyEntity> properties;



}
