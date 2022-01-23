package com.EA.testroom.REST_PROJEA2;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
public class Aliens {
	
	private String name;
	private int id;
	private int points;
	@Override
	public String toString() {
		return "Aliens [name=" + name + ", id=" + id + ", points=" + points + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}

}
