package com.rentals.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rentaltransactions")
public class RentalTransactionsEntity {

	@Id
	@GeneratedValue
	@Column(name="rentalTransactionID")
	private int rentalTransactionID;

	@Column(name="profileID")
	private int profileID;

	@Column(name="houseID")
	private int houseID;

	@Column(name="duration")
	private int duration;

	@Column(name="entryDate")
	private Date entryDate;

	@Column(name="dateCreated")
	private Date dateCreated;

	@Column(name="dateModified")
	private Date dateModified;

	@Column(name="active")
	private int active;



	public RentalTransactionsEntity() {
		super();
	}


	public int getRentalTransactionID() {
		return rentalTransactionID;
	}

	public void setRentalTransactionID(int rentalTransactionID) {
		this.rentalTransactionID = rentalTransactionID;
	}

	public int getProfileID() {
		return profileID;
	}

	public void setProfileID(int profileID) {
		this.profileID = profileID;
	}

	public int getHouseID() {
		return houseID;
	}

	public void setHouseID(int houseID) {
		this.houseID = houseID;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
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