package com.example.foyer_benslimene_aziz.services;

import com.example.foyer_benslimene_aziz.DAO.entities.Bloc;

import java.util.List;

public interface IBlocService {

    Bloc add(Bloc b);
    List<Bloc> addAll(List<Bloc> blocs);
    Bloc update (Bloc b);
    List<Bloc> findall() ;
    Bloc findById(long id);
    void delete (Bloc b);
    void deleteById (long id);

    List<Bloc> selectedNyNomBloc(String nomBloc );

    List<Bloc> findByNomBlocOrCapaciteBloc(String nomBloc, int capacite);
    List<Bloc> findByNomBlocAndCapaciteBloc(String nomBloc, int capacite);

}

