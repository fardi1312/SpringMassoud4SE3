package tn.esprit._4se3_.haninifiras.foyerhaninifiras.Service;

import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Bloc;

import java.util.List;
import java.util.Optional;

public interface IblocService {

    Bloc add(Bloc bloc);

    List<Bloc> addall(List<Bloc> blocs);

    Bloc update(Bloc bloc);

    List<Bloc> findall();

    Bloc findById(long id);

    void delete (Bloc bloc);

    void deleteById(long id);

    List<Bloc> findByNom(String nomB);
}
