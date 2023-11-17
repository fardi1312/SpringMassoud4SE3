package com.example.foyer_benslimene_aziz.services;

import com.example.foyer_benslimene_aziz.DAO.entities.Foyer;

import java.util.List;

public interface IFoyerService {

    Foyer add(Foyer foyer);

    List<Foyer> addall(List<Foyer> foyers);

    Foyer update(Foyer foyer);

    List<Foyer> findall();

    Foyer findById(long id);

    void delete (Foyer foyer);

    void deleteById(long id);
}
