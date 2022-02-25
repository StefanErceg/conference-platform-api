package org.unibl.etf.pisio.conference.services;

import org.unibl.etf.pisio.conference.base.CrudService;
import org.unibl.etf.pisio.conference.models.Event;

import java.util.List;

public interface EventService extends CrudService<Integer> {
    List<Event> findBySession(Integer sessionId);
}
