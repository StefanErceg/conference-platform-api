package org.unibl.etf.pisio.conference.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.unibl.etf.pisio.conference.models.entities.EventEntity;

import java.util.List;

@Repository
public interface EventEntityRepository extends JpaRepository<EventEntity, Integer> {
    List<EventEntity> findAllBySessionId(Integer sessionId);
    List<EventEntity> findAllBySession_Conference_Id(Integer conferenceId);
}