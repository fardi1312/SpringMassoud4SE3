package com.example.foyer_benslimene_aziz.entities;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;


@Table(name="Etudiant")
@Entity
@Getter
@Setter
public class Etudiant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEtudiant;

    private String nomEt ;

    private String prenomEt ;

    private long cin ;

    private String ecole ;

    private LocalDate dateNaissance ;

    @ManyToMany(mappedBy="etud", cascade = CascadeType.ALL)
    private Set<Reservation> reservations;

}