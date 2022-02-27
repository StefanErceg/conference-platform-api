package org.unibl.etf.pisio.conference.services;

import org.unibl.etf.pisio.conference.models.Login;
import org.unibl.etf.pisio.conference.models.requests.LoginRequest;

public interface AuthService {
    Login login(LoginRequest request);
}
