package com.rentals.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rentals.models.Customers;
import com.rentals.models.Houses;
import com.rentals.services.CustomersService;
import com.rentals.services.HousesService;

@RestController
public class Controller {

	@Autowired
	CustomersService customersService;
	HousesService housesService;
	
	@GetMapping("/customers/fetch")
	public List<Customers> getAllCustomers() {
		return customersService.getAllCustomers();
	}
	
	@PostMapping("/customers/create")
	public List<Customers> addCustomer(@RequestBody Customers customer) {
		customersService.addCustomer(customer);
		return customersService.getAllCustomers();
	}
	
	@GetMapping("/rentals/fetch")
	public List<Houses> getAllHouses() {
		return housesService.getAllHouses();
		
	}

}
