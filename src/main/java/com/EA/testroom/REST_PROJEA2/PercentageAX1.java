package com.EA.testroom.REST_PROJEA2;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class PercentageAX1 {
	 
	String discountPercentage;
	Date  discountDate;
	
	public String getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(String discountPercentage) {
		System.out.println("before setDiscountPercentage");
		this.discountPercentage = discountPercentage;
	}
	public Date getDiscountDate() {
		return discountDate;
	}
	public void setDiscountDate(Date date) {
		this.discountDate = date;
	}

}
