package tn.esprit._4se3_.haninifiras.foyerhaninifiras.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Chambre;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Repo.ChambreRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class chambreService implements IchambreService {

    private ChambreRepository repository;

    @Override
    public Chambre add(Chambre chambre) {
        return repository.save(chambre);
    }

    @Override
    public List<Chambre> addall(List<Chambre> chambres) {
        return repository.saveAll(chambres);
    }

    @Override
    public Chambre update(Chambre chambre) {
        return repository.save(chambre);
    }

    @Override
    public List<Chambre> findall() {
        return repository.findAll();
    }

    @Override
    public Chambre findById(long id) {
        return repository.findById(id).orElse(
                Chambre.builder().
                idChambre(0).numeroChambre(0)
                        .bloc(null).build()
        );
    }

    @Override
    public void delete(Chambre chambre) {
        repository.delete(chambre);

    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);

    }
}
