package com.rentals.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rentals.models.Customers;

public interface CustomerRepository extends JpaRepository<Customers, Integer> {

}
