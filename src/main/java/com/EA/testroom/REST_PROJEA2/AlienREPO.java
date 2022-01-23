package com.EA.testroom.REST_PROJEA2;

import java.util.ArrayList;
import java.util.List;

public class AlienREPO {
	
	List<Aliens> aliens;
	
	public AlienREPO() {
		
		aliens = new ArrayList<>();
		
		Aliens a1 = new Aliens();
		Aliens a2 = new Aliens();
		Aliens a3 = new Aliens();
		
		a1.setId(101);
		a1.setName("Dj Monsachi");
		a1.setPoints(70);
		aliens.add(a1);
		
		a2.setId(102);
		a2.setName("Dj Jazzy Jeff");
		a2.setPoints(80);
		
		a3.setId(103);
		a3.setName("Dj Snoop");
		a3.setPoints(80);
		
		aliens.add(a1);
		aliens.add(a2);
		aliens.add(a3);
		
	}
	// Get all Aliens 
	public List<Aliens> getAliens() {
		
		return aliens;
		
	}
	// Get one Alien from Client using ID
	
	public Aliens getAlien(int id) {
		
		for(Aliens a : aliens) {
			
			if(a.getId()==id) {
				return a;
			}
			
			
		}
		return null;
	}
	
	
	
	//Create a Resource BY Post Method
	public Aliens createAlien(Aliens a) {
		
		aliens.add(a);
		
		return a;
		
	}
	

}
