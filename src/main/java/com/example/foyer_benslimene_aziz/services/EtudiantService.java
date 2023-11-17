package com.example.foyer_benslimene_aziz.services;


import com.example.foyer_benslimene_aziz.DAO.entities.Etudiant;
import com.example.foyer_benslimene_aziz.DAO.repo.EtudiantRepository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantService implements IEtudiantService {

     EtudiantRepository repository;

    public Etudiant add(Etudiant etudiant) {
        return repository.save(etudiant);
    }


    @Override
    public List<Etudiant> addall(List<Etudiant> etudiants) {
        return repository.saveAll(etudiants);
    }

    @Override
    public Etudiant update(Etudiant etudiant) {
        return repository.save(etudiant);
    }




    @Override
    public List<Etudiant> findall() {
        return repository.findAll();
    }

    @Override
    public Etudiant findById(long id) {
        return repository.findById(id).orElse(
                Etudiant.builder()
                        .idEtudiant(0)
                        .cin(0)
                        .build()
        );
    }

    @Override
    public void delete(Etudiant etudiant) {
        repository.delete(etudiant);

    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);

    }
}
