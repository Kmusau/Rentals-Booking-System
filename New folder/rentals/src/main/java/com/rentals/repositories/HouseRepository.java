package com.rentals.repositories;

import com.rentals.entities.HousesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepository extends JpaRepository<HousesEntity, Integer> {

}