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
public class Chambre {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long idChambre;

    @Column(unique = true)
    private long numeroChambre;

    @Enumerated(EnumType.ORDINAL)
    private  Typechambre typeC;

    @OneToMany
    Set<Reservation> reservations= new HashSet<>();


    @ManyToOne
    Bloc bloc;


}
