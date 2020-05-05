package com.rentals.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rentals.models.Houses;
import com.rentals.repositories.HouseRepository;

@Service
public class HousesService {

	@Autowired
	HouseRepository houserepo;
	
	public List<Houses> getAllHouses() {
		return houserepo.findAll();
	}
}
