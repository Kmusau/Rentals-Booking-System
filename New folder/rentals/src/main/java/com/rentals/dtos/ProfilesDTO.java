package com.rentals.dtos;

import java.util.Date;

import com.rentals.enums.PinStatus;

public class ProfilesDTO {

	private int profileID;
	private String identificationNumber;
	private String msisdn;
	private String username;
	private String password;
	private PinStatus pinStatus;
	private String roles;
	private Date dateCreated;
	private Date dateModified;
	private int active;


	public ProfilesDTO() {
		super();
	}


	public ProfilesDTO(int profileID, String identificationNumber, String msisdn, String username, String password,
			PinStatus pinStatus, String roles, Date dateCreated, Date dateModified, int active) {
		super();
		this.profileID = profileID;
		this.identificationNumber = identificationNumber;
		this.msisdn = msisdn;
		this.username = username;
		this.password = password;
		this.pinStatus = pinStatus;
		this.roles = roles;
		this.dateCreated = dateCreated;
		this.dateModified = dateModified;
		this.active = active;
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

	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
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
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}




}