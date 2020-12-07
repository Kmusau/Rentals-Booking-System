package com.rentals.dtos;

import java.util.Date;

public class RentalTransactionsDTO {

	private int rentalTransactionID;
	private int profileID;
	private int houseID;
	private int duration;
	private Date entryDate;
	private Date dateCreated;
	private Date dateModified;
	private int active;


	public RentalTransactionsDTO() {
		super();
	}

	public RentalTransactionsDTO(int rentalTransactionID, int profileID, int houseID, int duration, Date entryDate,
			Date dateCreated, Date dateModified, int active) {
		super();
		this.rentalTransactionID = rentalTransactionID;
		this.profileID = profileID;
		this.houseID = houseID;
		this.duration = duration;
		this.entryDate = entryDate;
		this.dateCreated = dateCreated;
		this.dateModified = dateModified;
		this.active = active;
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