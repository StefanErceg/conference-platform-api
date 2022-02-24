package org.unibl.etf.pisio.conference.models;

import lombok.Data;

import java.util.List;

@Data
public class Visitor {
    private Integer id;
    private String email;
    private List<Conference> conferences;
}
