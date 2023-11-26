package tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Etudiant {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long idEtudiant;

    private String nomEt;
    private String prenomEt;
    private long cin;
    private String ecole;
    private Date dateNaissance;


    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations=new HashSet<>();

}
