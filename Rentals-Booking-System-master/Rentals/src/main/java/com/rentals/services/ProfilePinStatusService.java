package com.rentals.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rentals.entities.ProfilePinStatusEntity;
import com.rentals.repositories.ProfilePinStatusRepository;

@Service
public class ProfilePinStatusService {
	
	Logger logger = LoggerFactory.getLogger(ProfilePinStatusService.class);
	
	@Autowired
	ProfilePinStatusRepository profilePinStatusRepository;
	
	public List<ProfilePinStatusEntity> getAllProfilePinStatuses() {
		logger.info("info message for fetching all profile pin statuses");
		return profilePinStatusRepository.findAll();
		
	}

	public void addProfilePinStatus(ProfilePinStatusEntity profilePinStatusEntity) {
		logger.info("info message for adding a new profile Pin Status");
		profilePinStatusRepository.save(profilePinStatusEntity);
	}
	
}
