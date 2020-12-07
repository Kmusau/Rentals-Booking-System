package com.rentals.services;

import java.util.Date;
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
		logger.info("info message for fetching all customers");	
		return customerrepo.findAll();
	}

	public void addCustomer(CustomersEntity customer) {
		logger.info("info message for creating a new customer");
		if(customer.getDateCreated() == null) {
			customer.setDateCreated(new Date());
		}
		customerrepo.save(customer);
	}



}