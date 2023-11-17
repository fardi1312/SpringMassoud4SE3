package com.example.foyer_benslimene_aziz.services;

import com.example.foyer_benslimene_aziz.DAO.entities.Universite;
import com.example.foyer_benslimene_aziz.DAO.repo.UniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class UniveristeService implements IUniveristeService{
    UniversiteRepository repository;

    @Override
    public Universite add(Universite universite) {
        return repository.save(universite);
    }

    @Override
    public List<Universite> addall(List<Universite> universites) {
        return repository.saveAll(universites);
    }

    @Override
    public Universite update(Universite universite) {
        return repository.save(universite);
    }

    @Override
    public List<Universite> findall() {
        return repository.findAll();
    }

    @Override
    public Universite findById(long id) {
        return repository.findById(id).orElse(
                Universite.builder()
                        .idUniversite(0)
                        .build()
        );
    }

    @Override
    public void delete(Universite universite) {
        repository.delete(universite);

    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);

    }
}
