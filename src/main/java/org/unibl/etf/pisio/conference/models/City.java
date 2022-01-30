package org.unibl.etf.pisio.conference.models;

import lombok.Data;
import org.unibl.etf.pisio.conference.base.BaseEntity;

@Data
public class City {
    private Integer id;
    private String name;
    private String countryName;
}
