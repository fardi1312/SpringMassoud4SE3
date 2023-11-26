package tn.esprit._4se3_.haninifiras.foyerhaninifiras.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Foyer;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Repo.FoyerRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class FoyerService implements IfoyerService {

    private FoyerRepository repository;
    @Override
    public Foyer add(Foyer foyer) {
        return repository.save(foyer);
    }

    @Override
    public List<Foyer> addall(List<Foyer> foyers) {
        return repository.saveAll(foyers);
    }

    @Override
    public Foyer update(Foyer foyer) {
        return repository.save(foyer);
    }

    @Override
    public List<Foyer> findall() {
        return repository.findAll();
    }

    @Override
    public Foyer findById(long id) {
        return repository.findById(id).orElse(
                Foyer.builder()
                        .id(0)
                        .capaciteFoyer(0)
                        .nomFoyer(null).build()
        );
    }

    @Override
    public void delete(Foyer foyer) {
        repository.delete(foyer);

    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);

    }
}
