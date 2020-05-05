package RentalsBookingProject.Rentals.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import RentalsBookingProject.Rentals.models.Houses;
import RentalsBookingProject.Rentals.repositories.HouseRepository;

@Service
public class HousesService {

	@Autowired
	HouseRepository houserepo;
	
	public List<Houses> getAllHouses() {
		return houserepo.findAll();
	}
}
