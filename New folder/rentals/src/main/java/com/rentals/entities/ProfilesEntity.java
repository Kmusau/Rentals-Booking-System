package com.rentals.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.rentals.enums.PinStatus;

@Entity
@Table(name="profiles")
public class ProfilesEntity {

	@Id
	@Column(name="profileID")
	private int profileID;

	@Column(name="identificationNumber")
	private String identificationNumber;

	@Column(name="msisdn")
	private String msisdn;

	private String username;
	private String password;

	@Enumerated(EnumType.ORDINAL)
	private PinStatus pinStatus;

	private String roles;

	@Column(name="dateCreated")
	private Date dateCreated;

	@Column(name="dateModified")
	private Date dateModified;

	@Column(name="active")
	private boolean isActive;


	public ProfilesEntity() {
		super();
	}




	public int getProfileID() {
		return profileID;
	}
	public void setProfileID(int profileID) {
		this.profileID = profileID;
	}
	
	public String getIdentificationNumber() {
		return identificationNumber;
	}
	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getUsername() {
		return username;
	}




	public void setUsername(String username) {
		this.username = username;
	}




	public PinStatus getPinStatus() {
		return pinStatus;
	}


	public void setPinStatus(PinStatus pinStatus) {
		this.pinStatus = pinStatus;
	}


	public String getRoles() {
		return roles;
	}




	public void setRoles(String roles) {
		this.roles = roles;
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
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}


}