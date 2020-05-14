package RentalsBookingProject.Rentals.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import RentalsBookingProject.Rentals.models.Customers;
import RentalsBookingProject.Rentals.models.Houses;
import RentalsBookingProject.Rentals.services.CustomersService;
import RentalsBookingProject.Rentals.services.HousesService;

@RestController
public class controller {

	@Autowired
	CustomersService Cservice;
	
	@Autowired
	HousesService Hservice;
	
	
	
	@GetMapping("/customers/fetch")
	public List<Customers> getAllCustomers() {
		return Cservice.getAllCustomers();
	}
	
	@PostMapping("/customers/create")
	public List<Customers> addCustomer(@RequestBody Customers customer) {
		Cservice.addCustomer(customer);
		return Cservice.getAllCustomers();
	}
	
	@GetMapping("/houses/fetch")
	public List<Houses> get() {
		return Hservice.get();
	}

}