package com.example.springbootexample_animalhospital.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ownertable")
public class Owners {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    @Id
    private Long id;
    @Column(name = "ad")
    private String name;
    @Column(name = "soyad")
    private String lastName;
    @Column(name = "adres")
    private String address;
    @Column(name = "telefonNo")
    private String phoneNumber;
    @Column(name = "eMail")
    private String email;

    public Owners(){

    }

    @Override
    public String toString() {
        return "Owners{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", animals=" + animals +
                '}';
    }

    public Owners(String name, String lastName, String address, String phoneNumber, String email, List<Animals> animals,boolean b) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.animals = animals;
        b = true;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Animals> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animals> animals) {
        this.animals = animals;
    }

    @OneToMany(
            targetEntity = Animals.class,
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "pets",referencedColumnName = "id")
    private List<Animals> animals;

}
