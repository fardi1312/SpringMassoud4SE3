package com.example.foyer_benslimene_aziz.DAO.entities;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


import java.util.Set;

@Getter
@Setter
@Entity

@Table(name="Foyer")

@Builder
@AllArgsConstructor
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdFoyer;
    @Column(name="NomFoyer")
    private String NomFoyer;
    @Column(name="CapaciteFoyer")
    private long CapaciteFoyer;

    @OneToOne(mappedBy="instance")
    private Universite inst;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="Foy")
    private Set<Bloc> blocs;
}