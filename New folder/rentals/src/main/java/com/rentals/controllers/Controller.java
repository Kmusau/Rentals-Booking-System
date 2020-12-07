package com.rentals.controllers;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rentals.dtos.CustomerDTO;
import com.rentals.dtos.HousesDTO;
import com.rentals.dtos.HousestypesDTO;
import com.rentals.dtos.ProfilesDTO;
import com.rentals.dtos.RentalTransactionsDTO;
import com.rentals.dtos.TransactionsDTO;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rentals.entities.CustomersEntity;
import com.rentals.entities.HousesEntity;
import com.rentals.entities.HousestypesEntity;
import com.rentals.entities.ProfilesEntity;
import com.rentals.entities.RentalTransactionsEntity;
import com.rentals.entities.TransactionsEntity;
import com.rentals.repositories.CustomerRepository;
import com.rentals.services.CustomersService;
import com.rentals.services.HouseTypesService;
import com.rentals.services.HousesService;
import com.rentals.services.ProfilesService;
import com.rentals.services.RentalTransactionsService;
import com.rentals.services.TransactionsService;

@RestController
public class Controller {

	@Autowired
	CustomersService customersService;
	@Autowired
	CustomerRepository customerrepo;
	@Autowired
	HousesService housesService;
	@Autowired
	HouseTypesService houseTypeService;
	@Autowired
	ProfilesService profilesService;
	@Autowired
	RentalTransactionsService rentalTransactionsService;
	@Autowired
	TransactionsService transactionsService;

	private final ModelMapper modelMapper;
	private final ObjectMapper objectMapper;
	private final Logger logger;

	public Controller(ModelMapper modelMapper, ObjectMapper objectMapper, Logger logger) {
		this.modelMapper = modelMapper;
		this.objectMapper = objectMapper;
		this.logger = logger;
	}


	@GetMapping("/")
	public String welcome() {
		return "Welcome Home";
	}

	@GetMapping("/user")
	public String welcomeUser() {
		return "Welcome User";
	}

	@GetMapping("/admin")
	public String welcomeAdmin() {
		return "Welcome Admin";
	}


	//Customers end points

	@GetMapping("/customers/fetch")
	public List<CustomersEntity> getAllCustomers() {
		return customersService.getAllCustomers();
	}

/*	@PostMapping("/customers/create")
	public List<CustomersEntity> addCustomer(@RequestBody CustomerDTO customerDTO) throws JsonProcessingException {
		logger.info("Received Customer Details ::{}",objectMapper.writeValueAsString(customerDTO));
		//Map CustomerDTO to Customer Entity
		CustomersEntity customersEntity = modelMapper.map(customerDTO, CustomersEntity.class);
		logger.info("Mapped Customer Entity ::{}",objectMapper.writeValueAsString(customersEntity));
		customersService.addCustomer(customersEntity);
		return customersService.getAllCustomers();
	}
*/
	@PostMapping("customers/create")
	public List<CustomersEntity> addCustomer(@RequestBody CustomersEntity customer){
		customerrepo.save(customer);
		
		return customersService.getAllCustomers();
	}

	//Houses end points

	@GetMapping("/houses/fetch")
	public List<HousesEntity> getAllHouses() {
		return housesService.getAllHouses();
	}

	@PostMapping("/houses/create")
	public List<HousesEntity> addHouse(@RequestBody HousesDTO housesDTO) throws JsonProcessingException {
		logger.info("Received House Details ::{}",objectMapper.writeValueAsString(housesDTO));
		//Map HousesDTO to Houses Entity
		HousesEntity housesEntity = modelMapper.map(housesDTO, HousesEntity.class);
		logger.info("Mapped Houses Entity ::{}",objectMapper.writeValueAsString(housesEntity));
		housesService.addHouses(housesEntity);
		return housesService.getAllHouses();
	}


	//House types end points

	@GetMapping("/housetypes/fetch")
	public List<HousestypesEntity> getAllHousetypes() {
		return houseTypeService.getAllHouseTypes();

	}

	

	@PostMapping("/housetypes/create")
	public List<HousestypesEntity> addHousetype(@RequestBody HousestypesDTO housestypesDTO) throws JsonProcessingException {
		logger.info("Received HouseTypes Details ::{}",objectMapper.writeValueAsString(housestypesDTO));
		//Map HousestypesDTO to Houses types Entity
		HousestypesEntity housestypesEntity = modelMapper.map(housestypesDTO, HousestypesEntity.class);
		logger.info("Mapped House Types Entity ::{}",objectMapper.writeValueAsString(housestypesEntity));
		houseTypeService.addHousetype(housestypesEntity);
		return houseTypeService.getAllHouseTypes();
	}
	

	//Profiles end points

	@GetMapping("/profiles/fetch")
	public List<ProfilesEntity> getAllProfiles() {
		return profilesService.getAllProfiles();
	}

	@PostMapping("/profiles/create")
	public List<ProfilesEntity> addProfile(@RequestBody ProfilesDTO profilesDTO) throws JsonProcessingException {
		logger.info("Received Profiles Details ::{}",objectMapper.writeValueAsString(profilesDTO));
		//Map ProfilesDTO to Profiles Entity
		ProfilesEntity profilesEntity = modelMapper.map(profilesDTO, ProfilesEntity.class);
		logger.info("Mapped Profiles Entity ::{}",objectMapper.writeValueAsString(profilesEntity));
		profilesService.addProfile(profilesEntity);
		return profilesService.getAllProfiles();
	}

	// Rental Transactions end points


	@GetMapping("/rentaltransactions/fetch")
	public List<RentalTransactionsEntity> getAllRentalTransactions() {
		return rentalTransactionsService.getAllRentalTransactions();
	}

	@PostMapping("/rentaltransactions/create")
	public List<RentalTransactionsEntity> addRentalTransaction(@RequestBody RentalTransactionsDTO rentalTransactionsDTO) throws JsonProcessingException {
		logger.info("Received Rental Transactions Details ::{}",objectMapper.writeValueAsString(rentalTransactionsDTO));
		//Map Rental transactionsDTO to Rental Transactions Entity
		RentalTransactionsEntity rentalTransactionsEntity = modelMapper.map(rentalTransactionsDTO, RentalTransactionsEntity.class);
		logger.info("Mapped Rental Transactions Entity ::{}",objectMapper.writeValueAsString(rentalTransactionsEntity));
		rentalTransactionsService.addRentalTransaction(rentalTransactionsEntity);
		return rentalTransactionsService.getAllRentalTransactions();
	}


	//Transactions end points

	@GetMapping("transactions/fetch")
	public List<TransactionsEntity> getAllTransactions() {
		return transactionsService.getAllTransactions();
	}

	@PostMapping("/transactions/create")
	public List<TransactionsEntity> addTransaction(@RequestBody TransactionsDTO transactionsDTO) throws JsonProcessingException {
		logger.info("Received Transactions Details ::{}",objectMapper.writeValueAsString(transactionsDTO));
		//Map TransactionsDTO to Transactions Entity
		TransactionsEntity transactionsEntity = modelMapper.map(transactionsDTO, TransactionsEntity.class);
		logger.info("Mapped Transactions Entity ::{}",objectMapper.writeValueAsString(transactionsEntity));
		transactionsService.addTransaction(transactionsEntity);
		return transactionsService.getAllTransactions();
	}

}