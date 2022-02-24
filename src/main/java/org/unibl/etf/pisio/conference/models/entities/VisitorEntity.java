package org.unibl.etf.pisio.conference.models.entities;

import lombok.Data;
import org.unibl.etf.pisio.conference.base.BaseEntity;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "visitor")
public class VisitorEntity implements BaseEntity<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "email", nullable = false, length = 255)
    private String email;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "attendance",
            joinColumns = {
                    @JoinColumn(name = "visitor_id", referencedColumnName = "id",
                            nullable = false, updatable = false)
            },
            inverseJoinColumns = @JoinColumn(name = "conference_id", referencedColumnName = "id",
                    nullable = false, updatable = false))
    private Set<ConferenceEntity> conferences;

}
