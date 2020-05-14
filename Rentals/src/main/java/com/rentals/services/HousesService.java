package RentalsBookingProject.Rentals.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import RentalsBookingProject.Rentals.models.Houses;
import RentalsBookingProject.Rentals.repositories.HouseRepository;

@Service
public class HousesService {

	Logger logger = LoggerFactory.getLogger(HousesService.class);
	
	@Autowired
	HouseRepository houseRepo;
	
	public List<Houses> get() {
		//logging information
	/*	logger.debug("debug message for fetching all houses");
		logger.error("error message for fetching all houses"); */
		logger.info("info message for fetching all houses");
	/*	logger.trace("trace message for fetching all houses");
		logger.warn("debug message for fetching all houses"); */
		return houseRepo.findAll();
		
	}
}
