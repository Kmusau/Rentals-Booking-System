package com.rentals.services;

import java.util.Date;
import java.util.List;

import com.rentals.entities.HousesEntity;
import com.rentals.repositories.HouseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HousesService {

	Logger logger = LoggerFactory.getLogger(HousesService.class);

	@Autowired
	HouseRepository houseRepo;

	public List<HousesEntity> getAllHouses() {
		logger.info("info message for fetching all houses");
		return houseRepo.findAll();
	}

	public void addHouses(HousesEntity houses) {
		if(houses.getDateCreated() == null) {
			houses.setDateCreated(new Date());
		}
		houses.setDateModified(new Date());
		houseRepo.save(houses);
	}

}