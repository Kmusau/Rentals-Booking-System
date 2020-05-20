package com.rentals.repositories;

import com.rentals.models.Houses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepository extends JpaRepository<Houses, Integer> {

}
