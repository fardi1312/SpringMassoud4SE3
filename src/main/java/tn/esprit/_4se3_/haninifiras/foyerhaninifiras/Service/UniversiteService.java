package tn.esprit._4se3_.haninifiras.foyerhaninifiras.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Chambre;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Foyer;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Universite;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Bloc;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Reservation;

import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Repo.*;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteService implements IuniversiteService {

    private UniversiteRepository universiteRepository;
    private FoyerRepository foyerRepository;
    private BlocRepository blocRepository;
    private ChambreRepository chambreRepository;
    private ReservationRepository  reservationRepository;

    @Override
    public Universite add(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public List<Universite> addall(List<Universite> universites) {
        return universiteRepository.saveAll(universites);
    }

    @Override
    public Universite update(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public List<Universite> findall() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite findById(long id) {
        return universiteRepository.findById(id).orElse(
                Universite.builder()
                        .idUniversite(0)
                        .build()
        );
    }

    @Override
    public void delete(Universite universite) {
        universiteRepository.delete(universite);

    }

    @Override
    public void deleteById(long id) {
        universiteRepository.deleteById(id);

    }





    Universite affecterFoyeraUniversite ( long idFoyer, String nomUniversite){
        Universite u = universiteRepository.findByNomUniversite(nomUniversite);
        Foyer f = foyerRepository.findById(idFoyer).get();
        u.setFoyer(f);
        //  u.setFoyer(NULL);
        return universiteRepository.save(u) ;
    }

/////////////si foyer list dans univ et uniderectionell//////////
   // Universite affecterFoyeraUniversite2 ( long idFoyer, String nomUniversite){
    //    Universite Lis<u> = universiteRepository.findByNomUniversite(nomUniversite);
     //   Foyer f = foyerRepository.findById(idFoyer)0get();
      //  u.setFoyer(f).add(f);
    //si remove  :  u.setFoyer(f).remove(f)
      //  return u;
   // }

    @Override
    public Universite desaffecterFoyerAUniversite(long idUniversite) {
        Universite u = universiteRepository.findById(idUniversite).get();
        u.setFoyer(null);
        return universiteRepository.save(u) ;
    }
@Override
     public Bloc affecterChambresABloc(List<Long> numChambre, String nomBloc){
        Bloc b = blocRepository.findByNomBloc2(nomBloc);
        List<Chambre> chambres = new ArrayList<>();

        for(long nu : numChambre){
            chambres.add(chambreRepository.findByNumeroChambre(nu));
        }
        for(Chambre cha : chambres){
            cha.setBloc(b)    ;
            chambreRepository.save(cha);
        }




}
@Override
    public  Bloc affecterBlocAFoyer( String nomBloc, String nomFoyer) {
        Bloc b = blocRepository.findByNomBloc2(nomBloc);
        Foyer f = foyerRepository.findByNomFoyer(nomFoyer);
        b.setFoyer(f);
        return  blocRepository.save(b);
    }
/*
    @Override
    public Reservation ajouterReservationEtAssignerAChambreEtAEtudiant(long numChambre, String cin){

        Chambre c =chambreRepository.findByNumeroChambre(numChambre);
        Etudiant etudiant= etudiantRepository.findByCin(cin);
        //RECUPERATION DE L'ANNEE UNIVERSITAIRE COURANTE
        LocalDate dateDebutAU;
        LocalDate dateFinAU;
        int year = LocalDate.now().getYear() % 100;
        if (LocalDate.now().getMonthValue() <= 7) {
            dateDebutAU = LocalDate.of(Integer.parseInt("20" + (year - 1)), 9, 15);
            dateFinAU = LocalDate.of(Integer.parseInt("20" + year), 6, 30);
        } else {
            dateDebutAU = LocalDate.of(Integer.parseInt("20" + year), 9, 15);
            dateFinAU = LocalDate.of(Integer.parseInt("20" + (year + 1)), 6, 30);
        }

        long num= chambreRepository.countReservationsByAnneUniversitaireBetweenAndReservationsEstValide(dateDebutAU,dateFinAU,true);
        if(c.getTypeC().equals(Typechambre.SIMPLE)&&num<1){
            Reservation res=new Reservation();
            res.setIdReservation(dateDebutAU.getYear()+"/"+dateFinAU.getYear()+"-"+c.getBloc().getNomBloc()+"-"+c.getNumeroChambre()+"-"+etudiant.getCin());
            res.setAnneUniversitaire(LocalDate.now());
            res.setEstValide(true);
            repository.save(res);
        }


    }*/




    }
}
