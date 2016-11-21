package com.fit;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("RestWS")
public class RestWS {

	@GET
	@Path("hello/{name}")
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.TEXT_PLAIN)
	public String hello(@PathParam("name") String name) {
		return "Hello " + name +"!!!";
	}

}
