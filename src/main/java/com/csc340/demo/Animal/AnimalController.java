package com.csc340.demo.Animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/animals")
public class AnimalController {
    @Autowired
    private AnimalService service;

    @GetMapping("/all")
    public String getAllAnimals(Model model) {
        model.addAttribute("animalList", service.getAllAnimals());
        model.addAttribute("title", "All Animals");
        return "animal-list";
    }

    @GetMapping("/{animalId}")
    public String getAnimal(@PathVariable int animalId, Model model) {
        model.addAttribute("animal", service.getAnimal(animalId));
        model.addAttribute("title", animalId);
        return "animal-details";
    }

    @GetMapping("/createForm")
    public String showCreateForm() {
        return "animal-create";
    }

    @PostMapping("/new")
    public String addAnimal(Animal animal) {
        service.addAnimal(animal);
        return "redirect:/animals/all";
    }

    @GetMapping("/update/{animalId}")
    public String showUpdateForm(@PathVariable int animalId, Model model) {
        model.addAttribute("animal", service.getAnimal(animalId));
        return "animal-update";
    }

    @PostMapping("/update")
    public String updateAnimal(Animal animal) {
        service.addAnimal(animal);
        return "redirect:/animals/" + animal.getAnimalId();
    }

    @GetMapping("/delete/{animalId}")
    public String showDeleteForm(@PathVariable int animalId) {
        service.deleteAnimal(animalId);
        return "redirect:/animals/all";
    }

    @PostMapping("/search")
    public String searchAnimal(String string, Model model) {
        model.addAttribute("animalList", service.searchAnimal(string));
        model.addAttribute("title", string);
        if (string == "") {
            return "redirect:/animals/all";
        } else {
            return "animal-list";
        }
    }

}
