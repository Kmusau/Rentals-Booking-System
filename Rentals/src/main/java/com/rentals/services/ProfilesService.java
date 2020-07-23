package com.rentals.services;

import java.util.Date;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rentals.entities.ProfilesEntity;
import com.rentals.repositories.ProfilesRepository;

@Service
public class ProfilesService {
	
	Logger logger = LoggerFactory.getLogger(CustomersService.class);
	
	@Autowired
	ProfilesRepository profilesrepo;
	
	
	public List<ProfilesEntity> getAllProfiles() {
		logger.info("info message for fetching all customer Profiles");
		return profilesrepo.findAll();
		
	}
	
	public void addProfile(ProfilesEntity profilesEntity) {
		logger.info("info message for adding a new Profile");
		if(profilesEntity.getDateCreated() == null) {
			profilesEntity.setDateCreated(new Date());
		}
		profilesrepo.save(profilesEntity);
	}

	
	

}
