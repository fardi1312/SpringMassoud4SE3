package com.example.foyer_benslimene_aziz.services;

import com.example.foyer_benslimene_aziz.DAO.entities.Chambre;

import java.util.List;

public interface IChambreService {
    Chambre add(Chambre chambre);

    List<Chambre> addall(List<Chambre> chambres);

    Chambre update(Chambre chambre);

    List<Chambre> findall();

    Chambre findById(long id);

    void delete (Chambre chambre);

    void deleteById(long id);
}
