package RentalsBookingProject.Rentals.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import RentalsBookingProject.Rentals.models.Houses;

public interface HouseRepository extends JpaRepository<Houses, Integer> {

}
