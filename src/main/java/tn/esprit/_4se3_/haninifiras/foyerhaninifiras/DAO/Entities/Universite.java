package tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Universite {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long idUniversite;

    private String nomUniversite;
    private String adresse;

    @OneToOne(cascade = CascadeType.ALL) //ajout / modif supprim
    private Foyer foyer;

}
