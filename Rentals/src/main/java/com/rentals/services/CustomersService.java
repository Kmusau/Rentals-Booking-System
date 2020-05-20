package com.rentals.services;

import java.util.List;

import com.rentals.entities.CustomersEntity;
import com.rentals.repositories.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomersService {

	Logger logger = LoggerFactory.getLogger(CustomersService.class);
	
	@Autowired
	CustomerRepository customerrepo;
	
	public List<CustomersEntity> getAllCustomers() {
		//logging information
	/*	logger.debug("debug message for fetching all customers");
		logger.error("error message for fetching all customers"); */
		logger.info("info message for fetching all customers");
	/*	logger.trace("trace message for fetching all customers");
		logger.warn("debug message for fetching all customers");  */		
		return customerrepo.findAll();
	}

	public void addCustomer(CustomersEntity customer) {
		//logging information
	/*	logger.debug("debug message for creating a new customer");
		logger.error("error message for creating a new customer");  */
		logger.info("info message for creating a new customer");
	/*	logger.trace("trace message for creating a new customer");
		logger.warn("debug message for creating a new customer");	*/	
		customerrepo.save(customer);
	}
	
	
}
