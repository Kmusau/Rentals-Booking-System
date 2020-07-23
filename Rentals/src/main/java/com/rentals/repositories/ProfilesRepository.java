package com.rentals.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rentals.entities.ProfilesEntity;

public interface ProfilesRepository extends JpaRepository<ProfilesEntity, Integer> {

}
