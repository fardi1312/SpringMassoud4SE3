package com.example.foyer_benslimene_aziz.services;

import com.example.foyer_benslimene_aziz.DAO.entities.Universite;

import java.util.List;

public interface IUniveristeService {

    Universite add(Universite universite);

    List<Universite> addall(List<Universite> universite);

    Universite update(Universite universite);

    List<Universite> findall();

    Universite findById(long id);

    void delete (Universite universite);

    void deleteById(long id);
}
