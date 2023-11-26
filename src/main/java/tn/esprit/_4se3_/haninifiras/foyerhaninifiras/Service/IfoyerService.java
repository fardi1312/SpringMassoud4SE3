package tn.esprit._4se3_.haninifiras.foyerhaninifiras.Service;

import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Bloc;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Foyer;

import java.util.List;

public interface IfoyerService {

    Foyer add(Foyer foyer);

    List<Foyer> addall(List<Foyer> foyers);

    Foyer update(Foyer foyer);

    List<Foyer> findall();

    Foyer findById(long id);

    void delete (Foyer foyer);

    void deleteById(long id);
}
