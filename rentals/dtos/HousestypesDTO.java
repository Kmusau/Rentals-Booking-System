package com.rentals.dtos;

import java.util.Date;

import com.rentals.entities.HousestypesEntity;

public class HousestypesDTO {

	private int houseTypeID;
	private String houseType;
	private Date dateCreated;
	private Date dateModified;
	private int active;
	private HousestypesEntity housetypes;
	
	public HousestypesDTO() {
		super();
	}
	
	
	
	
	public HousestypesDTO(int houseTypeID, String houseType, Date dateCreated, Date dateModified, int active,
			HousestypesEntity housetypes) {
		super();
		this.houseTypeID = houseTypeID;
		this.houseType = houseType;
		this.dateCreated = dateCreated;
		this.dateModified = dateModified;
		this.active = active;
		this.housetypes = housetypes;
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


	public HousestypesEntity getHousetypes() {
		return housetypes;
	}


	public void setHousetypes(HousestypesEntity housetypes) {
		this.housetypes = housetypes;
	}
	
	
	
}
