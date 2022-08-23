package com.example.springbootexample_animalhospital.service;

import com.example.springbootexample_animalhospital.entity.Animals;

import java.util.List;
import java.util.Optional;

public interface AnimalService {
    //Read operation
    List<Animals> fetchOwnersAnimalsJoinFetch();
    void deleteOrder(long id);
    //Save operation
    Animals saveAnimals(Animals animals);
    Optional<Animals> getAnimalsById(long id);

}
