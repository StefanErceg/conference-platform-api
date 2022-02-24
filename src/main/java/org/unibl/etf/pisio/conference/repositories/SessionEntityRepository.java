package org.unibl.etf.pisio.conference.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.unibl.etf.pisio.conference.models.entities.ConferenceEntity;
import org.unibl.etf.pisio.conference.models.entities.SessionEntity;

import java.util.List;

@Repository
public interface SessionEntityRepository extends JpaRepository<SessionEntity, Integer> {
    List<SessionEntity> findAllByConference_Id(Integer conferenceId);
}
