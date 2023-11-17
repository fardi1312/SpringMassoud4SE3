package com.example.foyer_benslimene_aziz.DAO.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


import java.io.Serializable;


@Table(name="universite")
@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Universite implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUniversite;

    private String nomUniversite ;

    private String adresse ;

    @OneToOne
    private Foyer instance;
}