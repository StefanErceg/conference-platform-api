package org.unibl.etf.pisio.conference.models.requests;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;
    private String password;
}
