package com.EA.testroom.REST_PROJEA2;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
//this traffic is moving slow like a bill tru congress

@Path("AlienX")

public class AlienResourceAX {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	//@Path("AX")
	public Aliens getAliensAX() {
		System.out.println("getAliens(AX) called");	
		Aliens a1 = new Aliens();
		a1.setId(101);
		a1.setName("Dj Monsachi");
		a1.setPoints(70);
		
		return a1;
		
	}
	
	
	
	
	
	
	
	/*
	 * @GET
	 * 
	 * @Produces(MediaType.TEXT_PLAIN)
	 * 
	 * @Path("{id}/{go}")
	 * 
	 * public String getAlien1(@PathParam("id") int id,@PathParam("go") String go) {
	 * 
	 * return "got Alien XXXX "+id +"---"+ go; }
	 * 
	 * @GET
	 * 
	 * @Produces(MediaType.TEXT_PLAIN)
	 * 
	 * @Path("{id}/{go}/{name}")
	 * 
	 * public String getAlien2(@PathParam("id") int id,@PathParam("go") String
	 * go,@PathParam("name") String name) {
	 * 
	 * return "got Alien1 XXXX "+id +"---"+ go + "-----" + name; }
	 */
	

}
