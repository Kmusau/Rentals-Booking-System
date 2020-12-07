package com.rentals.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.rentals.entities.ProfilesEntity;
import com.rentals.repositories.ProfilesRepository;

@Service
public class ProfilesService implements UserDetailsService {

	Logger logger = LoggerFactory.getLogger(CustomersService.class);

	@Autowired
	ProfilesRepository profilesrepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<ProfilesEntity> user = profilesrepo.findByUsername(username);

		 if (user.isPresent()){
			 return user.map(UserDetailsImpl::new).get();
	        }else{
	            throw new UsernameNotFoundException(username);
	        }

	}


	public List<ProfilesEntity> getAllProfiles() {
		logger.info("info message for fetching all customer Profiles");
		return profilesrepo.findAll();

	}

	public void addProfile(ProfilesEntity profilesEntity) {
		logger.info("info message for adding a new Profile");
		if(profilesEntity.getDateCreated() == null) {
			profilesEntity.setDateCreated(new Date());
		}
		profilesEntity.setDateModified(new Date());
		profilesrepo.save(profilesEntity);
	}




}