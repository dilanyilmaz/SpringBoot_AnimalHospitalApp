package com.example.springbootexample_animalhospital.repository;


import com.example.springbootexample_animalhospital.entity.Animals;
import com.example.springbootexample_animalhospital.entity.Owners;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AnimalRepository extends JpaRepository<Animals,Long>{
    @Query("SELECT a from Animals a inner join a.id b")
    List<Animals> fetchAnimalsOwnersByIdInnerJoin();
}
