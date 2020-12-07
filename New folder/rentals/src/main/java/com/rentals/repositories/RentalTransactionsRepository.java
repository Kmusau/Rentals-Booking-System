package com.rentals.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rentals.entities.RentalTransactionsEntity;

public interface RentalTransactionsRepository extends JpaRepository<RentalTransactionsEntity, Integer> {

}