package com.rentals.controllers;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rentals.dtos.CustomerDTO;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rentals.entities.CustomersEntity;
import com.rentals.entities.HousesEntity;
import com.rentals.services.CustomersService;
import com.rentals.services.HousesService;

@RestController
public class Controller {

	@Autowired
	CustomersService customersService;
	HousesService housesService;
	private final ModelMapper modelMapper;
	private final ObjectMapper objectMapper;
	private final Logger logger;

	public Controller(ModelMapper modelMapper, ObjectMapper objectMapper, Logger logger) {
		this.modelMapper = modelMapper;
		this.objectMapper = objectMapper;
		this.logger = logger;
	}


	@GetMapping("/customers/fetch")
	public List<CustomersEntity> getAllCustomers() {
		return customersService.getAllCustomers();
	}
	
	@PostMapping("/customers/create")
	public List<CustomersEntity> addCustomer(@RequestBody CustomerDTO customerDTO) throws JsonProcessingException {
		logger.info("Received Customer Details ::{}",objectMapper.writeValueAsString(customerDTO));
		//Map CustomerDTO to Customer Entity
		CustomersEntity customersEntity = modelMapper.map(customerDTO, CustomersEntity.class);
		logger.info("Mapped Customer Entity ::{}",objectMapper.writeValueAsString(customersEntity));
		customersService.addCustomer(customersEntity);
		return customersService.getAllCustomers();
	}
	
	@GetMapping("/rentals/fetch")
	public List<HousesEntity> getAllHouses() {
		return housesService.getAllHouses();
		
	}

}
