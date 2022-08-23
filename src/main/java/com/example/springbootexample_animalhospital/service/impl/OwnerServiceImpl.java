package com.example.springbootexample_animalhospital.service.impl;

import com.example.springbootexample_animalhospital.entity.Animals;
import com.example.springbootexample_animalhospital.entity.Owners;
import com.example.springbootexample_animalhospital.repository.AnimalRepository;
import com.example.springbootexample_animalhospital.repository.OwnerRepository;
import com.example.springbootexample_animalhospital.service.OwnerService;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerServiceImpl implements OwnerService {
    private final OwnerRepository ownerRepository;
    public OwnerServiceImpl(OwnerRepository ownerRepository) {
        super();
        this.ownerRepository = ownerRepository;
    }

    @Override
    public Owners saveOwners(Owners owners){return ownerRepository.save(owners);}
}
