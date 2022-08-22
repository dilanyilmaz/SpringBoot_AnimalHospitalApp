package com.example.springbootexample_animalhospital.repository;

import com.example.springbootexample_animalhospital.entity.Owners;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OwnerRepository extends JpaRepository<Owners,Long> {
    List<Owners> getAllOwners();

}
