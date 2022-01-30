package org.unibl.etf.pisio.conference.models.entities;

import lombok.Data;
import org.unibl.etf.pisio.conference.base.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "location")
public class LocationEntity implements BaseEntity<Integer> {
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
    @Column(name = "address", nullable = false, length = 255)
    private String address;
    @Basic
    @Column(name = "room", nullable = true, length = 255)
    private String room;
    @OneToMany(mappedBy = "location")
    private List<EventEntity> events;
    @ManyToOne
    @JoinColumn(name = "city_id", referencedColumnName = "id")
    private CityEntity city;
    @ManyToOne
    @JoinColumn(name = "location_type_id", referencedColumnName = "id", nullable = false)
    private LocationTypeEntity locationType;

}
