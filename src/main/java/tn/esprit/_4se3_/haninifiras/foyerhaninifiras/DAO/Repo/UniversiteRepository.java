package tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Universite;

public interface UniversiteRepository extends JpaRepository<Universite,Long> {

    Universite findByNomUniversite(String nom);

}
