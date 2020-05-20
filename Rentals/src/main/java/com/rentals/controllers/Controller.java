package com.rentals.controllers;

import java.util.List;

import com.rentals.configs.ModelMapperConfig;
import com.rentals.dtos.CustomerDTO;
import org.modelmapper.ModelMapper;
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
	ModelMapper modelMapper;

	@GetMapping("/customers/fetch")
	public List<CustomersEntity> getAllCustomers() {
		return customersService.getAllCustomers();
	}
	
	@PostMapping("/customers/create")
	public List<CustomersEntity> addCustomer(@RequestBody CustomerDTO customerDTO) {
		//Map CustomerDTO to Customer Entity
		CustomersEntity customersEntity = modelMapper.map(customerDTO, CustomersEntity.class);
		customersService.addCustomer(customersEntity);
		return customersService.getAllCustomers();
	}
	
	@GetMapping("/rentals/fetch")
	public List<HousesEntity> getAllHouses() {
		return housesService.getAllHouses();
		
	}

}
