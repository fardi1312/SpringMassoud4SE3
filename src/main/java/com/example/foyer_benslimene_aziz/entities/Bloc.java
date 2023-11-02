package com.example.foyer_benslimene_aziz.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Table(name="Bloc")
@Entity
@Getter
@Setter
public class Bloc implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nomBloc ;

    private long capaciteBloc ;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="BL")
    private Set<Chambre> cham;

    @ManyToOne
    Foyer Foy;

}
