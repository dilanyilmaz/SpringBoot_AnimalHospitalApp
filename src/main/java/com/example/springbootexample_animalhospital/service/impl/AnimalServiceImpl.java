package com.example.springbootexample_animalhospital.service.impl;

import com.example.springbootexample_animalhospital.entity.Animals;
import org.springframework.stereotype.Service;
import com.example.springbootexample_animalhospital.repository.AnimalRepository;
import com.example.springbootexample_animalhospital.service.AnimalService;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalServiceImpl implements AnimalService {
    private final AnimalRepository animalRepository;

    public AnimalServiceImpl(AnimalRepository animalRepository) {
        super();
        this.animalRepository = animalRepository;
    }

    @Override
    public List<Animals> fetchOwnersAnimalsJoinFetch() {
        return animalRepository.fetchOwnersAnimalsJoinFetch();
    }

    @Override
    public Animals saveAnimals(Animals animals) {
        return animalRepository.save(animals);
    }

    @Override
    public Optional<Animals> getAnimalsById(long id) {
        return animalRepository.findById(id);
    }
    @Override
    public void deleteOrder(long id){  animalRepository.deleteById(id);}

   /*
    @Override
    public Animals updateAnimalsByID(Animals animals) {
        Optional<Animals> animalData = animalRepository.findById(animals.getId());
            Animals _animals = animalData.get();
            _animals.setAciklama(animals.getAciklama());
            _animals.setCins(animals.getCins());
            _animals.setTur(animals.getTur());
            _animals.setYas(animals.getYas());
          return new Animals(animalRepository.save(_animals));

    }*/
}