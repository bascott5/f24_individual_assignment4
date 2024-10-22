package com.csc340.demo.Animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }

    public Animal getAnimal(int animalId) {
        return animalRepository.findById(animalId).orElse(null);
    }

    public void addAnimal(Animal animal) {
        animalRepository.save(animal);
    }

    public void updateAnimal(int animalId, Animal animal) {
        Animal existing = getAnimal(animalId);
        existing.setName(animal.getName());
        existing.setScientificName(animal.getScientificName());
        existing.setSpecies(animal.getSpecies());
        existing.setHabitat(animal.getHabitat());
        existing.setDescription(animal.getDescription());

        animalRepository.save(animal);
    }

    public void deleteAnimal(int animalId) {
        animalRepository.deleteById(animalId);
    }

    public List<Animal> getAnimalsBySpecies(String species) {
        return animalRepository.getAnimalsBySpecies(species);
    }

    public List<Animal> searchAnimal(String string) {
        return animalRepository.searchAnimal(string);
    }
}
