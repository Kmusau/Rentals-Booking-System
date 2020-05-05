package RentalsBookingProject.Rentals.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import RentalsBookingProject.Rentals.models.Customers;

public interface CustomerRepository extends JpaRepository<Customers, Integer> {

}
