package com.example.foyer_benslimene_aziz.services;

import com.example.foyer_benslimene_aziz.DAO.entities.Etudiant;

import java.util.List;
public interface IEtudiantService  {



        Etudiant add(Etudiant etudiant);

        List<Etudiant> addall(List<Etudiant> etudiants);

        Etudiant update(Etudiant etudiant);

        List<Etudiant> findall();

        Etudiant findById(long id);

        void delete (Etudiant etudiant);

        void deleteById (long id);
}
