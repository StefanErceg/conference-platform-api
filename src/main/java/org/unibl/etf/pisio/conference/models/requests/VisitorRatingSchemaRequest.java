package org.unibl.etf.pisio.conference.models.requests;

import lombok.Data;
import org.unibl.etf.pisio.conference.models.VisitorRatingProperty;

import java.util.List;

@Data
public class VisitorRatingSchemaRequest {
    private String name;
    private List<VisitorRatingProperty> properties;
}
