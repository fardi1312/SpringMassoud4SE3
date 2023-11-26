package tn.esprit._4se3_.haninifiras.foyerhaninifiras.Service;

import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Bloc;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Chambre;

import java.util.List;

public interface IchambreService {

    Chambre add(Chambre chambre);

    List<Chambre> addall(List<Chambre> chambres);

    Chambre update(Chambre chambre);

    List<Chambre> findall();

    Chambre findById(long id);

    void delete (Chambre chambre);

    void deleteById(long id);
}
