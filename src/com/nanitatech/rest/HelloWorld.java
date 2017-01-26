package com.nanitatech.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorld {
	
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg){
		String output = "Sopheak say: " + msg;
		return Response.status(200).entity(output).build();
	}
}
