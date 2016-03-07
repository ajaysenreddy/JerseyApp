package com.inverasolutions.net.springboot.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by InveraSolutionsInc on 3/6/16.
 */
@XmlRootElement
public class Location {

    private Double lat;
    private Double lng;

    public Location() {}

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }
}
