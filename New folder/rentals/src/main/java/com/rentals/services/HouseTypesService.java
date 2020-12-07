package com.rentals.services;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rentals.entities.HousestypesEntity;
import com.rentals.repositories.HousestypesRepository;

@Service
public class HouseTypesService {

	Logger logger = LoggerFactory.getLogger(HouseTypesService.class);

	@Autowired
	HousestypesRepository housetyperepo;

	public List<HousestypesEntity> getAllHouseTypes() {
		logger.info("info message for fetching all House Types");
		return housetyperepo.findAll();
	}
	public void addHousetype(HousestypesEntity housetype) {
		logger.info("info message for adding a new House Type");
		if(housetype.getDateCreated() == null) {
			housetype.setDateCreated(new Date());
		}
		housetyperepo.save(housetype);
	}

}