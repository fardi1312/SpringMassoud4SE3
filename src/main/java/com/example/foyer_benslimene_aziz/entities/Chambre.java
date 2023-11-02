package com.example.foyer_benslimene_aziz.entities;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Table(name="chambre")
@Entity
@Getter
@Setter
public class Chambre implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChambre;

    private long numChambre ;

    private String typeC ;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> resv;
    @ManyToOne
    Bloc BL;
}
//@NoArgsConstructor // constructeur par defaut
//@AllArgsConstructor // constructeur parametre (tous les attributs)
//@Builder // constructeur parametre personnalisé