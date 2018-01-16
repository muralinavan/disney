package com.disney.service;


import com.disney.model.input.SafeLaunchDateRequest;
import com.disney.model.output.SafeLaunchDateResponse;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
/**
 * Created by muralinavaneethan on 1/15/18.
 */
@WebService
@Path("/asteroidavoidant")
public interface AsteroidAvoidanceService {

    @POST
    @Path("/safelaunchdate")
    @Produces(MediaType.APPLICATION_JSON)
    SafeLaunchDateResponse getSafeLaunchDate(@WebParam(name = "safeLaunchDateRequest")SafeLaunchDateRequest safeLaunchDateRequest) throws Exception;
}
