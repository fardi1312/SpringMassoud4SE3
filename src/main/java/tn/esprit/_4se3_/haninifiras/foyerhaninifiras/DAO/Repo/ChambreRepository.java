package tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Bloc;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Chambre;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Typechambre;

import java.util.Date;
import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
/*
    Chambre findByNumeroChambre(long num);

    Chambre findByTypeC(Typechambre type);

    List<Chambre> findByBloc(Bloc bloc);

    List<Chambre> findByBlocAndTypeC(Bloc bloc,Typechambre type);

    Chambre findByNumeroChambreAndTypeC(long num,Typechambre type);

    Chambre findByBlocFoyerUniversiteNomUniversiteAndReservationsAnneeUniversitaireAndReservationsEtudiantsNomEtAndNumeroChambre(String nomUni, Date date, String nomEtudiant, long numero );




*/
Chambre  findByNumeroChambre(Long nu);
}
