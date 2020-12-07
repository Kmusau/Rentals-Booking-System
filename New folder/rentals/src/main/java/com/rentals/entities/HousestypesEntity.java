package com.rentals.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "housestypes")
public class HousestypesEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "houseTypeID")
	private int houseTypeID;

	@Column(name = "houseType")
	private String houseType;

	@Column(name = "dateCreated")
	private Date dateCreated;

	@Column(name = "dateModified")
	private Date dateModified;

	@Column(name = "active")
	private int active;

	@OneToMany(targetEntity = HousesEntity.class, cascade = CascadeType.ALL)
	@JoinColumn(name="houseTypeID", referencedColumnName="houseTypeID")
	public List<HousesEntity> houses;


	public HousestypesEntity() {
		super();
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