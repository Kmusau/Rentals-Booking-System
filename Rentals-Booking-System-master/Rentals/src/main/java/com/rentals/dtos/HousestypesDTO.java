package com.rentals.dtos;

import java.util.Date;

public class HousestypesDTO {

	private int houseTypeID;
	private String houseType;
	private Date dateCreated;
	private Date dateModified;
	private int active;
	
	
	public HousestypesDTO() {
		super();
	}
	
	
	public HousestypesDTO(int houseTypeID, String houseType, Date dateCreated, Date dateModified, int active) {
		super();
		this.houseTypeID = houseTypeID;
		this.houseType = houseType;
		this.dateCreated = dateCreated;
		this.dateModified = dateModified;
		this.active = active;
	}
	
	
	public int getHouseTypeID() {
		return houseTypeID;
	}
	public void setHouseTypeID(int houseTypeID) {
		this.houseTypeID = houseTypeID;
	}
	public String getHouseType() {
		return houseType;
	}
	public void setHouseType(String houseType) {
		this.houseType = houseType;
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
