package com.rentals.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rentals.models.Customers;
import com.rentals.repositories.CustomerRepository;

@Service
public class CustomersService {

	@Autowired
	CustomerRepository customerRepository;
	
	public List<Customers> getAllCustomers() {
		return customerRepository.findAll();
	}

	public void addCustomer(Customers customer) {
		customerRepository.save(customer);
	}
	
	
}
