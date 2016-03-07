package com.inverasolutions.net.springboot.dao;

import com.inverasolutions.net.springboot.model.GeocodeResponse;

/**
 * Created by InveraSolutionsInc on 3/6/16.
 */
public interface GeocodingDao {
    GeocodeResponse findGeocodingResponse(String address);
}
