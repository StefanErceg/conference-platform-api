package org.unibl.etf.pisio.conference.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.unibl.etf.pisio.conference.models.entities.ResourceTypeEntity;

@Repository
public interface ResourceTypeEntityRepository extends JpaRepository<ResourceTypeEntity, Integer> {
}
