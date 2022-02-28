package org.unibl.etf.pisio.conference.services;

import org.unibl.etf.pisio.conference.models.client.ClientEvent;

import java.util.List;

public interface ClientEventService {
    List<ClientEvent> findAllByConferenceId(Integer conferenceId);
}
