package com.inverasolutions.net.springboot.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by InveraSolutionsInc on 3/6/16.
 */
@XmlRootElement
public class GeocodeResponse {

    private String status;

    @XmlElement(name = "results")
    private List<StreetAddress> results;

    public GeocodeResponse() {}

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setResults(List<StreetAddress> results) {
        this.results = results;
    }

    public List<StreetAddress> getResults() {
        return results;
    }
}
