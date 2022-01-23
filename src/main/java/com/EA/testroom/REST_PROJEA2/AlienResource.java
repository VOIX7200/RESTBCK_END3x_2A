package com.EA.testroom.REST_PROJEA2;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("AlienY")

public class AlienResource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("{id}/{go}")
	
	public String getAlien(@PathParam("id") int id,@PathParam("go") String go) {
		
		return "got Alien XXXX "+id +"---"+ go;
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("{id}/{go}/{name}")
	
	public String getAlien1(@PathParam("id") int id,@PathParam("go") String go,@PathParam("name") String name) {
		
		return "got Alien1 XXXX "+id +"---"+ go + "-----" + name;
	}
	

}
