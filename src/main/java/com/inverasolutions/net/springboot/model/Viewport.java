package com.inverasolutions.net.springboot.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by InveraSolutionsInc on 3/7/16.
 */
@XmlRootElement
public class Viewport {

    private Northeast northeast;

    private Southwest southwest;

    public Viewport() {}

    public Northeast getNortheast() {
        return northeast;
    }

    public void setNortheast(Northeast northeast) {
        this.northeast = northeast;
    }

    public Southwest getSouthwest() {
        return southwest;
    }

    public void setSouthwest(Southwest southwest) {
        this.southwest = southwest;
    }

    private class Northeast {
        private Double lat;
        private Double lng;

        public Northeast() {}

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

    private class Southwest {
        private Double lat;
        private Double lng;

        public Southwest() {}

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

    private class Southeast {
        private Double lat;
        private Double lng;

        public Southeast() {}

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

    private class Northwest {
        private Double lat;
        private Double lng;

        public Northwest() {}

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
}


