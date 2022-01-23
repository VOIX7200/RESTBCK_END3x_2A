package com.EA.testroom.REST_PROJEA2;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("disc")
public class MyDiscountResource {
	String percentage = "";
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{amount}")	
	public PercentageAX1 getDiscountPercent(@PathParam("amount") int amount) {
	//public String getDiscountPercent() {
		System.out.println("getDiscountPercent called");
		//Date date = new Date();
		Date date = java.util.Calendar.getInstance().getTime();
		DiscountService1 dcs = new DiscountService1();
		System.out.println("before percentageAX");
		PercentageAX1 pax = new PercentageAX1();
		pax.setDiscountDate(date);
		pax.setDiscountPercentage(dcs.getDiscount(amount));
	//	percentage = dcs.getDiscount(amount);
	//	return percentage;
		//return dcs.getDiscount(amount);
		System.out.println("before return pax");
		return pax;
	}

}

/*
 * @Path("AlienX")
 * 
 * public class AlienResourceAX {
 * 
 * @GET
 * 
 * @Produces(MediaType.APPLICATION_JSON) //@Path("AX") public Aliens
 * getAliensAX() { System.out.println("getAliens(AX) called"); Aliens a1 = new
 * Aliens(); a1.setId(101); a1.setName("Dj Monsachi"); a1.setPoints(70);
 * 
 * return a1;
 * 
 * }
 */