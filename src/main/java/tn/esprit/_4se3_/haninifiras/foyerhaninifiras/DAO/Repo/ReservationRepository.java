package tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Reservation;

import java.util.Date;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {

    List<Reservation> findByEstValideTrue();

    List<Reservation> findByEtudiantsIdEtudiant(long id);

    List<Reservation> findByAnneUniversitaireAndEstValide(Date annee, Boolean valide);
}
