package com.example.springbootexample_animalhospital.repository;


import com.example.springbootexample_animalhospital.entity.Animals;
import com.example.springbootexample_animalhospital.entity.Owners;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import javax.transaction.Transactional;
import java.util.List;

public interface AnimalRepository extends JpaRepository<Animals,Long>{
    @Query(value = "SELECT a from Animals a inner join a.petowner b ")
    List<Animals> fetchOwnersAnimalsJoinFetch();
}
