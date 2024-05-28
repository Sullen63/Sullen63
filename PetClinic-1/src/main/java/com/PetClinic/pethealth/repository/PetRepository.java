package com.PetClinic.pethealth.repository;

import org.springframework.data.repository.CrudRepository;

import com.PetClinic.pethealth.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Integer> {

}
