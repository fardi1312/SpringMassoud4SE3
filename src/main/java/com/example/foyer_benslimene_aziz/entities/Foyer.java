package com.example.foyer_benslimene_aziz.entities;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity

@Table(name="Foyer")

public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String IdFoyer;
    @Column(name="NomFoyer")
    private String NomFoyer;
    @Column(name="CapaciteFoyer")
    private long CapaciteFoyer;

    @OneToOne(mappedBy="instance")
    private Universite inst;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="Foy")
    private Set<Bloc> blocs;
}