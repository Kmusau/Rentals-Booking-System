package com.rentals.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.rentals.enums.PaymentMode;

@Entity
@Table(name="transactions")
public class TransactionsEntity {

	@Id
	@GeneratedValue
	@Column(name="transactionID")
	private int transactionID;

	@Column(name="rentalTransactionID")
	private int rentalTransactionsID;

	@Column(name="amount")
	private float amount;

	@Enumerated(EnumType.STRING)
	private PaymentMode paymentMode;

	@Column(name="referenceNumber")
	private String referenceNumber;

	@Column(name="dateCreated")
	private Date dateCreated;

	@Column(name="dateModified")
	private Date dateModified;

	@Column(name="active")
	private int active;


	public TransactionsEntity() {
		super();
	}


	public int getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}
	public int getRentalTransactionsID() {
		return rentalTransactionsID;
	}
	public void setRentalTransactionsID(int rentalTransactionsID) {
		this.rentalTransactionsID = rentalTransactionsID;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getReferenceNumber() {
		return referenceNumber;
	}
	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
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


	public PaymentMode getPaymentMode() {
		return paymentMode;
	}


	public void setPaymentMode(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
	}



}