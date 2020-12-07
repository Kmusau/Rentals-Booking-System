package com.rentals.services;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rentals.entities.RentalTransactionsEntity;
import com.rentals.repositories.RentalTransactionsRepository;

@Service
public class RentalTransactionsService {

	Logger logger = LoggerFactory.getLogger(CustomersService.class);

	@Autowired
	RentalTransactionsRepository rentalsTransactionsrepo;

	public List<RentalTransactionsEntity> getAllRentalTransactions() {
		logger.info("info message for fetching all rentals transactions");
		return rentalsTransactionsrepo.findAll();
	}

	public void addRentalTransaction(RentalTransactionsEntity rentalTransactionsEntity) {
		logger.info("info message for fetching all rental transactions");
		if(rentalTransactionsEntity.getDateCreated() == null) {
			rentalTransactionsEntity.setDateCreated(new Date());
		}
		rentalsTransactionsrepo.save(rentalTransactionsEntity);
	}

}