package com.example.foyer_benslimene_aziz.services;

import com.example.foyer_benslimene_aziz.DAO.entities.Chambre;

import java.util.List;

import com.example.foyer_benslimene_aziz.DAO.repo.ChambreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ChambreService implements IChambreService {

    ChambreRepository repository;

    @Override
    public Chambre add(Chambre chambre) {
        return repository.save(chambre);
    }

    @Override
    public List<Chambre> addall(List<Chambre> chambres) {
        return repository.saveAll(chambres);
    }

    @Override
    public Chambre update(Chambre chambre) {
        return repository.save(chambre);
    }

    @Override
    public List<Chambre> findall() {
        return repository.findAll();
    }

    @Override
    public Chambre findById(long id) {
        return repository.findById(id).orElse(
                Chambre.builder().
                        idChambre(0)
                        .numChambre(0)
                        .build()
        );
    }

    @Override
    public void delete(Chambre chambre) {
        repository.delete(chambre);

    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);

    }
}
