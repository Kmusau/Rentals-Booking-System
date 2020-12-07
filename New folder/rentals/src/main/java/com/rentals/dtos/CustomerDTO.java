package com.rentals.dtos;

import java.util.Date;
import java.util.List;

import com.rentals.entities.ProfilesEntity;

public class CustomerDTO {
    private int customersID;
    private String firstName;
    private String otherNames;
    private String emailAddress;
    private Date dateOfBirth; 
    private Date dateCreated;
    private Date dateModified;
    private int active;
    public List<ProfilesEntity> profiles;


	public CustomerDTO() {

	}


	public CustomerDTO(int customersID, String firstName, String otherNames, String emailAddress, Date dateOfBirth,
			Date dateCreated, Date dateModified, int active, List<ProfilesEntity> profiles) {
		super();
		this.customersID = customersID;
		this.firstName = firstName;
		this.otherNames = otherNames;
		this.emailAddress = emailAddress;
		this.dateOfBirth = dateOfBirth;
		this.dateCreated = dateCreated;
		this.dateModified = dateModified;
		this.active = active;
		this.profiles = profiles;
	}


	public int getCustomersID() {
		return customersID;
	}
	public void setCustomersID(int customersID) {
		this.customersID = customersID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getOtherNames() {
		return otherNames;
	}
	public void setOtherNames(String otherNames) {
		this.otherNames = otherNames;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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

	public List<ProfilesEntity> getProfiles() {
		return profiles;
	}

	public void setProfiles(List<ProfilesEntity> profiles) {
		this.profiles = profiles;
	}


}