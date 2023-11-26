package tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Bloc;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Foyer;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Universite;

import java.util.List;

public interface FoyerRepository extends JpaRepository<Foyer,Long> {


    Foyer findByNomFoyer(String nomFoyer);




}
