package com.rentals.dtos;

import java.util.Date;

import com.rentals.enums.PaymentMode;

public class TransactionsDTO {

	private int transactionID;
	private int rentalTransactionsID;
	private float amount;
	private PaymentMode paymentMode; 
	private String referenceNumber;
	private Date dateCreated;
	private Date dateModified;
	private int active;


	public TransactionsDTO() {
		super();
	}


	public TransactionsDTO(int transactionID, int rentalTransactionsID, float amount, PaymentMode paymentMode,
			String referenceNumber, Date dateCreated, Date dateModified, int active) {
		super();
		this.transactionID = transactionID;
		this.rentalTransactionsID = rentalTransactionsID;
		this.amount = amount;
		this.paymentMode = paymentMode;
		this.referenceNumber = referenceNumber;
		this.dateCreated = dateCreated;
		this.dateModified = dateModified;
		this.active = active;
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