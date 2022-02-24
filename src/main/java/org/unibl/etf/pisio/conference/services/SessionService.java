package org.unibl.etf.pisio.conference.services;

import org.unibl.etf.pisio.conference.base.CrudService;
import org.unibl.etf.pisio.conference.models.Session;

import java.util.List;

public interface SessionService extends CrudService<Integer> {
    List<Session> findByConference(Integer conferenceId);
}
