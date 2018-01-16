package com.disney.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path
import javax.ws.rs.Produces;


/**
 * Created by muralinavaneethan on 1/15/18.
 */
@WebService(endpointInterface = "com.disney.service.AsteroidAvoidanceService")
@Path("/asteroidavoidant")
public class AsteroidAvoidanceServiceImpl implements AsteroidAvoidanceService {

    private final static Logger log = LoggerFactory.getLogger(AsteroidAvoidanceServiceImpl.class);


    @POST
    @Path("/safelaunchdate")
    @Consumes({"application/json", "application/xml"})
    @Produces({"application/json", "application/xml"})
    @Override
    public SafeLaunchDateResponse getSafeLaunchDate(@WebParam(name = "safeLaunchDateRequest") SafeLaunchDateRequest request) throws Exception {


    }


}
