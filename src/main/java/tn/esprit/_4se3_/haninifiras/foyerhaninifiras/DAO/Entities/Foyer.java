package tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Foyer {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    private String nomFoyer;

    private long capaciteFoyer;

    @OneToOne(mappedBy = "foyer")
    private Universite universite;

    @OneToMany(mappedBy = "foyer")
    private Set<Bloc> blocs=new HashSet<>();
}
