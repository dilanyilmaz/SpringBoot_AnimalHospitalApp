package com.example.springbootexample_animalhospital.controller;

import com.example.springbootexample_animalhospital.entity.Animals;
import com.example.springbootexample_animalhospital.entity.Owners;
import com.example.springbootexample_animalhospital.service.OwnerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.springbootexample_animalhospital.service.AnimalService;

@Controller
public class OrderController {
    private final AnimalService animalService;
    private final OwnerService ownerService;


    public OrderController(AnimalService animalService, OwnerService ownerService) {
        this.animalService = animalService;
        this.ownerService = ownerService;
    }
    //handler method to handle list animals and return mode and view

    @GetMapping("/all")
    public String listOwners(Model model){
        model.addAttribute("Owners",animalService.fetchOwnersAnimalsJoinFetch());
        return "animals";
    }
    @PostMapping("/newOrder")
    public ResponseEntity<Owners> createOwners(@RequestBody Owners owners){
        try {
            Owners _owners = ownerService
                    .saveOwners(new Owners(owners.getName(),owners.getLastName(),owners.getAddress(),
                            owners.getPhoneNumber(),owners.getEmail(),owners.getAnimals(),false));
            return new ResponseEntity<>(_owners, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
  /*  @GetMapping("/tutorials/{id}")
    public String getTutorialById(@PathVariable("id") long id , Model model) {
        model.addAttribute("index",animalService.getAnimalsById(id));
        return "index";
    }
    @PostMapping("/postanimals")
    public ResponseEntity<Animals> createAnimals(@RequestBody Animals animals){
        try {
            Animals _animals = animalService
                    .saveAnimals(new Animals(animals.getTur(),animals.getCins(),animals.getYas(),animals.getAciklama(),false));
            return new ResponseEntity<>(_animals, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
*/
}
