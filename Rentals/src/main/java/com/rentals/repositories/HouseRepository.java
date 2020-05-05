package com.rentals.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rentals.models.Houses;

public interface HouseRepository extends JpaRepository<Houses, String> {

}
