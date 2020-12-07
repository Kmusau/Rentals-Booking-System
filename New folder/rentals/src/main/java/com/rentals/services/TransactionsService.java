package com.rentals.services;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rentals.entities.TransactionsEntity;
import com.rentals.repositories.TransactionsRepository;

@Service
public class TransactionsService {

	Logger logger = LoggerFactory.getLogger(CustomersService.class);

	@Autowired
	TransactionsRepository transactionsRepository;

	public List<TransactionsEntity> getAllTransactions() {
		logger.info("info message for fetching all transactions");
		return transactionsRepository.findAll();
	}

	public void addTransaction(TransactionsEntity transactionsEntity) {
		if(transactionsEntity.getDateCreated() == null) {
			transactionsEntity.setDateCreated(new Date());
		}
		transactionsRepository.save(transactionsEntity);
	}

}