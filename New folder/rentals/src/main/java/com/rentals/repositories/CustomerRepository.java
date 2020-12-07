package com.rentals.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rentals.entities.CustomersEntity;

public interface CustomerRepository extends JpaRepository<CustomersEntity, Integer> {

}