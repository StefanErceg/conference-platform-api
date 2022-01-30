package org.unibl.etf.pisio.conference.models.entities;

import lombok.Data;
import org.unibl.etf.pisio.conference.base.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "city")
public class CityEntity implements BaseEntity<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "name", nullable = false, length = 255)
    private String name;
    @ManyToOne
    @JoinColumn(name = "country_id", referencedColumnName = "id", nullable = false)
    private CountryEntity country;
    @OneToMany(mappedBy = "city")
    private List<LocationEntity> locations;

}
