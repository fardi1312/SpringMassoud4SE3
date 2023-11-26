package com.example.foyer_benslimene_aziz.DAO.repo;


import com.example.foyer_benslimene_aziz.DAO.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
