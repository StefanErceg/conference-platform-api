package org.unibl.etf.pisio.conference.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Login extends User {
    private String token;
}