package com.example.foyer_benslimene_aziz.DAO.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;


@Table(name="reservation")
@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Reservation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idReservation;

    private LocalDate anneeUniversitaire;

    private boolean estValide ;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiant> etud;


}