package com.fernando;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        Long pega = pega();
        return "Hello RESTEasy " + "Fernando" + pega;
    }

    private Long pega(){
        return 1l;
    }
    private Long pega2(){
        return 1l;
    }


}