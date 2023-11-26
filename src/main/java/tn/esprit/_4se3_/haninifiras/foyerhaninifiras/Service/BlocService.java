package tn.esprit._4se3_.haninifiras.foyerhaninifiras.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Bloc;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Chambre;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Repo.BlocRepository;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Repo.ChambreRepository;

import java.util.List;
import java.util.Set;


@Service
@AllArgsConstructor
public class BlocService implements IblocService {


    BlocRepository blocRepository;
    ChambreRepository chambreRepository;

    @Override
    public Bloc add(Bloc bloc) {
        Set<Chambre> chambres= bloc.getChambres();
        bloc=blocRepository.save(bloc);
        for(Chambre chambre : chambres){
            chambre.setBloc(bloc);
            chambreRepository.save(chambre);
        }

        return bloc;
    }




    @Override
    public List<Bloc> addall(List<Bloc> blocs) {
        return blocRepository.saveAll(blocs);
    }

    @Override
    public Bloc update(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public List<Bloc> findall() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc findById(long id) {
        return blocRepository.findById(id).orElse(Bloc.builder()
                .idBloc(0)
                .capaciteBloc(0)
                .build());
    }

    @Override
    public void delete(Bloc bloc) {

        Set<Chambre> chambres= bloc.getChambres();
       blocRepository.delete(bloc);
        for(Chambre chambre : chambres){
      //      chambre.setBloc(bloc);
            chambreRepository.delete(chambre);
        }




    }

    @Override
    public void deleteById(long id) {

        blocRepository.deleteById(id);
    }


    @Override
    public List<Bloc> findByNom(String nomB) {
        return blocRepository.findByNomBloc(nomB);
    }




}
