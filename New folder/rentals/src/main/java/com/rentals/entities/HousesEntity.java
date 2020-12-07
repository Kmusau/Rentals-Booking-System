package com.rentals.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "houses")
public class HousesEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="houseID")
	private int houseID;

	@Column(name="houseNumber")
	private String houseNumber;

	@Column(name="location")
	private String location;

	@Column(name="price")
	private float price;

	@Column(name="dateCreated")
	private Date dateCreated;

	@Column(name="dateModified")
	private Date dateModified;

	@Column(name="active")
	private int active;



	public HousesEntity() {
		super();
	}


	public int getHouseID() {
		return houseID;
	}
	public void setHouseID(int houseID) {
		this.houseID = houseID;
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