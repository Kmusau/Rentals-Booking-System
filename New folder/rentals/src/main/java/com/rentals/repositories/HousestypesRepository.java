package com.rentals.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rentals.entities.HousestypesEntity;

public interface HousestypesRepository extends JpaRepository<HousestypesEntity, Integer> {

}