package com.rentals.dtos;

import java.util.Date;

import com.rentals.enums.PinStatus;

public class ProfilesDTO {
	
	private int profileID;
	private int customersID;
	private String identificationNumber;
	private String msisdn;
	private String password;
	private PinStatus pinStatus;
	private Date dateCreated;
	private Date dateModified;
	private int active;
	

	public ProfilesDTO() {
		super();
	}


	public ProfilesDTO(int profileID, int customersID, String identificationNumber, String msisdn, String password,
			PinStatus pinStatus, Date dateCreated, Date dateModified, int active) {
		super();
		this.profileID = profileID;
		this.customersID = customersID;
		this.identificationNumber = identificationNumber;
		this.msisdn = msisdn;
		this.password = password;
		this.pinStatus = pinStatus;
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
	public int getCustomersID() {
		return customersID;
	}
	public void setCustomersID(int customersID) {
		this.customersID = customersID;
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
