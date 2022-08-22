package com.example.springbootexample_animalhospital.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "pettable")
public class Animals implements Serializable {
    private static final long serialVersionUID = 1L;
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pet_id")
    @Id
    private Long id;

    @Column(name = "tur")
    private String tur;

    @Column(name = "cins")
    private String cins;

    @Column(name = "yas")
    private String yas;

    @Column(name = "aciklama")
    private String aciklama;

    public Animals(){

    }
    public Animals(String tur, String cins, String yas, String aciklama, boolean b) {
        this.tur = tur;
        this.cins = cins;
        this.yas = yas;
        this.aciklama = aciklama;
        b=true;
    }
    public Long getId() {
        return id;
    }
    public String getTur() {
        return tur;
    }
    public void setTur(String tur) {
        this.tur = tur;
    }
    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }

    public String getYas() {
        return yas;
    }

    public void setYas(String yas) {
        this.yas = yas;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "id=" + id +
                ", tur='" + tur + '\'' +
                ", cins='" + cins + '\'' +
                ", yas='" + yas + '\'' +
                ", aciklama='" + aciklama + '\'' +
                '}';
    }

}
