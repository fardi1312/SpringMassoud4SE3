package com.example.foyer_benslimene_aziz.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@Table(name="universite")
@Entity
@Getter
@Setter
public class Universite implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUniversite;

    private String nomUniversite ;

    private String adresse ;

    @OneToOne
    private Foyer instance;
}