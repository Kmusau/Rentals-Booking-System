package com.rentals.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "houses")
public class Houses {

	@Id
	@Column(name = "name")
	private String name;
	@Column(name = "location")
	private String location;
	@Column(name = "distance_from")
	private String distanceFrom;
	@Column(name = "rent p/m")
	private int rent;
	@Column(name = "type")
	private String type;
	
	
	public Houses() {
		super();
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDistanceFrom() {
		return distanceFrom;
	}
	public void setDistanceFrom(String distanceFrom) {
		this.distanceFrom = distanceFrom;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
