package org.unibl.etf.pisio.conference.models.entities;

import lombok.Data;
import org.unibl.etf.pisio.conference.base.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "visitor_rating_schema_has_visitor_rating_property")
public class VisitorRatingSchemaHasVisitorRatingPropertyEntity implements BaseEntity<VisitorRatingSchemaHasVisitorRatingPropertyEntityKey> {
    @EmbeddedId
    private VisitorRatingSchemaHasVisitorRatingPropertyEntityKey id;
    @ManyToOne
    @JoinColumn(name = "visitor_rating_schema_id", referencedColumnName = "id", nullable = false)
    @MapsId("visitorRatingSchemaId")
    private VisitorRatingSchemaEntity visitorRatingSchema;
    @ManyToOne
    @JoinColumn(name = "visitor_rating_property_id", referencedColumnName = "id", nullable = false)
    @MapsId("visitorRatingPropertyId")
    private VisitorRatingPropertyEntity visitorRatingProperty;

}

@Embeddable
@Data
class VisitorRatingSchemaHasVisitorRatingPropertyEntityKey implements Serializable {
    @Column(name = "visitor_rating_schema_id")
    private Integer visitorRatingSchemaId;

    @Column(name = "visitor_rating_property_id")
    private Integer visitorRatingPropertyId;
}