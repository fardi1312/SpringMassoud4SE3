package com.example.foyer_benslimene_aziz.services;

import com.example.foyer_benslimene_aziz.DAO.repo.FoyerRepository;
import com.example.foyer_benslimene_aziz.DAO.entities.Foyer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class FoyerService implements IFoyerService {

    FoyerRepository repository;
    @Override
    public Foyer add(Foyer foyer) {
        return repository.save(foyer);
    }

    @Override
    public List<Foyer> addall(List<Foyer> foyers) {
        return repository.saveAll(foyers);
    }

    @Override
    public Foyer update(Foyer foyer) {
        return repository.save(foyer);
    }

    @Override
    public List<Foyer> findall() {
        return repository.findAll();
    }

    @Override
    public Foyer findById(long id) {
        return repository.findById(id).orElse(
                Foyer.builder()
                        .IdFoyer(0)
                        .CapaciteFoyer(0)
                        .NomFoyer(null).build()
        );
    }

    @Override
    public void delete(Foyer foyer) {
        repository.delete(foyer);

    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);

    }
}
