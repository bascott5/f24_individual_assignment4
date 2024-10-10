package com.csc340.demo.Animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {
    @Autowired
    private AnimalService service;

    @GetMapping("/all")
    public List<Animal> getAllAnimals() {
        return service.getAllAnimals();
    }

    @GetMapping("/{animalId}")
    public Animal getAnimal(@PathVariable int animalId) {
        return service.getAnimal(animalId);
    }

    @PostMapping("/new")
    public List<Animal> addAnimal(@RequestBody Animal animal) {
        service.addAnimal(animal);
        return service.getAllAnimals();
    }

    @PutMapping("/update/{animalId}")
    public Animal updateAnimal(@PathVariable int animalId, @RequestBody Animal animal) {
        service.updateAnimal(animalId, animal);
        return service.getAnimal(animalId);
    }

    @DeleteMapping("/delete/{animalId}")
    public List<Animal> deleteAnimal(@PathVariable int animalId) {
        service.deleteAnimal(animalId);
        return service.getAllAnimals();
    }

    @GetMapping("/species/{species}")
    public List<Animal> getAnimalsBySpecies(@PathVariable String species) {
        return service.getAnimalsBySpecies(species);
    }

    @GetMapping("/search/{string}")
    public List<Animal> searchAnimal(@PathVariable String string) {
        return service.searchAnimal(string);
    }

}
