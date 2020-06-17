package com.rentals.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.rentals.enums.PinStatus;

@Entity
@Table(name="profilepinstatus")
public class ProfilePinStatusEntity {
	
	@Id
	@GeneratedValue
	@Column(name="profilePinStatusID")
	private int profilePinStatusID;
	
	@Enumerated(EnumType.STRING)
	private PinStatus pinStatus;

	@Column(name="dateCreated")
	private Date dateCreated;
	@Column(name="dateModified")
	private Date dateModified;
	@Column(name="active")
	private int active;
	
	
	public ProfilePinStatusEntity() {
		super();
	}

	
	public int getProfilePinStatusID() {
		return profilePinStatusID;
	}
	public void setProfilePinStatusID(int profilePinStatusID) {
		this.profilePinStatusID = profilePinStatusID;
	}
	public PinStatus getPinStatus() {
		return pinStatus;
	}


	public void setPinStatus(PinStatus pinStatus) {
		this.pinStatus = pinStatus;
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
