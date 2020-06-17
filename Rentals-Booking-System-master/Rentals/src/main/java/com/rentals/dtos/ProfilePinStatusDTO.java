package com.rentals.dtos;

import java.util.Date;

import com.rentals.enums.PinStatus;

public class ProfilePinStatusDTO {
	
	private int profilePinStatusID;
	private PinStatus pinStatus;
	private Date dateCreated;
	private Date dateModified;
	private int active;

	
	
	public ProfilePinStatusDTO() {
		super();
	}



	public ProfilePinStatusDTO(int profilePinStatusID, PinStatus pinStatus, Date dateCreated, Date dateModified,
			int active) {
		super();
		this.profilePinStatusID = profilePinStatusID;
		this.pinStatus = pinStatus;
		this.dateCreated = dateCreated;
		this.dateModified = dateModified;
		this.active = active;
	}



	public int getProfilePinStatusID() {
		return profilePinStatusID;
	}
	public void setProfilePinStatusID(int profilePinStatusID) {
		this.profilePinStatusID = profilePinStatusID;
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


	public PinStatus getPinStatus() {
		return pinStatus;
	}


	public void setPinStatus(PinStatus pinStatus) {
		this.pinStatus = pinStatus;
	}
	
	

}
