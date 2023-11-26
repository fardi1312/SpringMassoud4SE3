package tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Reservation {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private String idReservation;

    @Temporal(TemporalType.DATE)
    private Date anneUniversitaire;

    private boolean estValide;

    @ManyToMany(mappedBy = "reservations",cascade = CascadeType.ALL)
    Set<Etudiant> etudiants=new HashSet<>();

}
