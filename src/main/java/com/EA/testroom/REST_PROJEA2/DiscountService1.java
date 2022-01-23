package com.EA.testroom.REST_PROJEA2;

//import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement

public class DiscountService1 { 

	public String discountPercentage = "";

	public String getDiscount(int amount) {
		
		if(amount > 5000 && amount < 10000) {
			discountPercentage = "10%";
		}else if (amount >10000 && amount <20000) {
			
			discountPercentage = "15%";
		}else if(amount >20000 && amount <30000){
			
			discountPercentage = "18%";
		}else if(amount >30000 && amount <40000) {
			
			discountPercentage = "20%";
		}else {
			
			discountPercentage = "NA";
		}
		
		
		return discountPercentage;
	}


}
