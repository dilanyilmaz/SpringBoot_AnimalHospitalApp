package com.example.springbootexample_animalhospital.service;

import com.example.springbootexample_animalhospital.entity.Owners;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OwnerService {
    List<Owners> getAllOwners();
    Owners saveOwners(Owners owners);
}
