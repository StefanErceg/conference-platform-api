package org.unibl.etf.pisio.conference.models.entities;

import lombok.Data;
import org.unibl.etf.pisio.conference.base.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "resource")
public class ResourceEntity implements BaseEntity<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "name", nullable = false, length = 255)
    private String name;
    @Basic
    @Column(name = "identifier", nullable = true, length = 255)
    private String identifier;
    @Basic
    @Column(name = "description", nullable = true, length = -1)
    private String description;
    @OneToMany(mappedBy = "resource")
    private List<EventHasResourceEntity> eventHasResources;
    @ManyToOne
    @JoinColumn(name = "resource_type_id", referencedColumnName = "id", nullable = false)
    private ResourceTypeEntity resourceType;

}
