package tn.esprit._4se3_.haninifiras.foyerhaninifiras.Service;

import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.*;

import java.util.ArrayList;
import java.util.List;

public interface IuniversiteService {

    Universite add(Universite universite);

    List<Universite> addall(List<Universite> universite);

    Universite update(Universite universite);

    List<Universite> findall();

    Universite findById(long id);

    void delete (Universite universite);

    void deleteById(long id);






    Universite desaffecterFoyerAUniversite (long idUniversite) ;

    Bloc affecterChambresABloc(List<Long> numChambre, String nomBloc);

    Bloc affecterBlocAFoyer( String nomBloc, String nomFoyer);

    Reservation ajouterReservationEtAssignerAChambreEtAEtudiant (Long numChambre, String cin) ;
