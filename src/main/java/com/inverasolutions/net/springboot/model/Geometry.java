package com.inverasolutions.net.springboot.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by InveraSolutionsInc on 3/6/16.
 */
@XmlRootElement(name = "geometry")
public class Geometry {

    private Location location;

    private String location_type;

    private Viewport viewport;

    public Geometry() {}

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getLocation_type() {
        return location_type;
    }

    public void setLocation_type(String location_type) {
        this.location_type = location_type;
    }

    public Viewport getViewport() {
        return viewport;
    }

    public void setViewport(Viewport viewport) {
        this.viewport = viewport;
    }
}
