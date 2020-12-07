package com.rentals.dtos;

import java.util.Date;
import java.util.List;

import com.rentals.entities.HousesEntity;

public class HousestypesDTO {

	private int houseTypeID;
	private String houseType;
	private Date dateCreated;
	private Date dateModified;
	private int active;
	public List<HousesEntity> houses;

	public HousestypesDTO() {
		super();
	}


	public HousestypesDTO(int houseTypeID, String houseType, Date dateCreated, Date dateModified, int active,
			List<HousesEntity> houses) {
		super();
		this.houseTypeID = houseTypeID;
		this.houseType = houseType;
		this.dateCreated = dateCreated;
		this.dateModified = dateModified;
		this.active = active;
		this.houses = houses;
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


	public List<HousesEntity> getHouses() {
		return houses;
	}


	public void setHouses(List<HousesEntity> houses) {
		this.houses = houses;
	}


}