package com.example.springbootexample_animalhospital;

import com.example.springbootexample_animalhospital.entity.Animals;
import com.example.springbootexample_animalhospital.repository.AnimalRepository;
import org.aspectj.weaver.GeneratedReferenceTypeDelegate;
import org.hibernate.engine.jdbc.env.spi.IdentifierCaseStrategy;
import org.hibernate.internal.util.collections.IdentityMap;
import org.hibernate.loader.plan.spi.BidirectionalEntityReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlType;

@SpringBootApplication
public class SpringBootExampleAnimalHospitalApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringBootExampleAnimalHospitalApplication.class, args);
    }

}
