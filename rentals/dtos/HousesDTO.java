package com.rentals.dtos;

import java.util.Date;

public class HousesDTO {

	private int houseID;
	private int houseTypeID;
	private String houseNumber;
	private String location;
	private float price;
	private Date dateCreated;
	private Date dateModified;
	private int active;
	
	

	public HousesDTO() {
	
	}

	public HousesDTO(int houseID, int houseTypeID, String houseNumber, String location, float price, Date dateCreated,
			Date dateModified, int active) {
		super();
		this.houseID = houseID;
		this.houseTypeID = houseTypeID;
		this.houseNumber = houseNumber;
		this.location = location;
		this.price = price;
		this.dateCreated = dateCreated;
		this.dateModified = dateModified;
		this.active = active;
	}


	public int getHouseID() {
		return houseID;
	}

	public void setHouseID(int houseID) {
		this.houseID = houseID;
	}

	public int getHouseTypeID() {
		return houseTypeID;
	}

	public void setHouseTypeID(int houseTypeID) {
		this.houseTypeID = houseTypeID;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateModified() {
		return dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}
	
	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}
	
	
}
