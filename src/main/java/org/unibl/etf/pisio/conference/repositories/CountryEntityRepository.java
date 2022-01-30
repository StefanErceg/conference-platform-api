package org.unibl.etf.pisio.conference.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.unibl.etf.pisio.conference.models.entities.CountryEntity;

@Repository
public interface CountryEntityRepository extends JpaRepository<CountryEntity, Integer> {
    Boolean existsByName(String name);
    Boolean existsByNameAndIdNot(String name, Integer id);
}
