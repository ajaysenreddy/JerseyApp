package com.inverasolutions.net.springboot.rest;

import com.inverasolutions.net.springboot.model.GeocodeResponse;
import com.inverasolutions.net.springboot.service.GeocodingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by InveraSolutionsInc on 3/5/16.
 */
@Path("/geocoding")
@Component
public class GeocodingResource {

    @Autowired
    private GeocodingService geocodingService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findGeocodingAddress(@QueryParam("address") String address) {

        GeocodeResponse geocodeResponse = geocodingService.findGeocodingResponse(address);

        return Response.ok().entity(geocodeResponse).build();

    }

}
