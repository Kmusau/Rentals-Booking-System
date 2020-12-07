package com.rentals.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rentals.entities.TransactionsEntity;

public interface TransactionsRepository extends JpaRepository<TransactionsEntity, Integer> {

}