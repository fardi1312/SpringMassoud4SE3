package com.example.foyer_benslimene_aziz.DAO.entities;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;


@Table(name="Bloc")
@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
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
