package com.rentals.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class CustomersEntity {

	@Id
	@GeneratedValue
	@Column(name = "customersID")
	private int customersID;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "other_names")
	private String otherNames;

	@Column(name = "email_address")
	private String emailAddress;

	@Column(name = "dateOfBirth")
	private Date dateOfBirth;

	@Column(name = "dateCreated")
	private Date dateCreated;

	@Column(name = "dateModified")
	private Date dateModified;

	@Column(name = "active")
	private int active;
	

	@OneToMany(targetEntity = ProfilesEntity.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "customersID", referencedColumnName = "customersID")
	public List<ProfilesEntity> profiles;
	

	public CustomersEntity() {
		super();
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