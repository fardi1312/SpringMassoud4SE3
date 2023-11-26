package tn.esprit._4se3_.haninifiras.foyerhaninifiras.Service;

import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Bloc;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Etudiant;

import java.util.List;

public interface IetudiantService {

    Etudiant add(Etudiant etudiant);

    List<Etudiant> addall(List<Etudiant> etudiants);

    Etudiant update(Etudiant etudiant);

    List<Etudiant> findall();

    Etudiant findById(long id);

    void delete (Etudiant etudiant);

    void deleteById(long id);
}
