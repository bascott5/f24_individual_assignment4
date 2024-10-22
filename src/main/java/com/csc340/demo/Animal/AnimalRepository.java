package com.csc340.demo.Animal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {

    @Query(value = "select * from animals where species = %:species%", nativeQuery = true)
    List<Animal> getAnimalsBySpecies(@Param("species")String species);

    @Query(value = "select * from animals where name like %:string%", nativeQuery = true)
    List<Animal> searchAnimal(@Param("string")String string);
}
