package com.example.foyer_benslimene_aziz.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;


@Table(name="reservation")
@Entity
@Getter
@Setter
public class Reservation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idReservation;

    private LocalDate anneeUniversitaire;

    private boolean estValide ;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiant> etud;


}