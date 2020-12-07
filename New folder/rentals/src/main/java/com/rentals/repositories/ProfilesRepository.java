package com.rentals.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rentals.entities.ProfilesEntity;

public interface ProfilesRepository extends JpaRepository<ProfilesEntity, Integer> {
	Optional<ProfilesEntity> findByUsername(String username);
}