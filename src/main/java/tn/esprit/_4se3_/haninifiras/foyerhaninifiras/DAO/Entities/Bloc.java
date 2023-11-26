package tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Bloc {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long idBloc;

    private String nomBloc;

    private long capaciteBloc;

    @ManyToOne
    Foyer foyer;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bloc")
    Set<Chambre> chambres=new HashSet<>();

}
