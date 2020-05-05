package RentalsBookingProject.Rentals.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import RentalsBookingProject.Rentals.models.Customers;
import RentalsBookingProject.Rentals.repositories.CustomerRepository;

@Service
public class CustomersService {

	@Autowired
	CustomerRepository customerrepo;
	
	public List<Customers> getAllCustomers() {
		return customerrepo.findAll();
	}

	public void addCustomer(Customers customer) {
		customerrepo.save(customer);
	}
	
	
}
