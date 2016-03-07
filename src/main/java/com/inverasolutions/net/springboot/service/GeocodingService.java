package com.inverasolutions.net.springboot.service;

import com.inverasolutions.net.springboot.model.GeocodeResponse;

/**
 * Created by InveraSolutionsInc on 3/6/16.
 */
public interface GeocodingService {

    GeocodeResponse findGeocodingResponse(String address);

}
