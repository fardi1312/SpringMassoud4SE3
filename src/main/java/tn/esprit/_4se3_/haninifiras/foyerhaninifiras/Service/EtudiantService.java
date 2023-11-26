package tn.esprit._4se3_.haninifiras.foyerhaninifiras.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Etudiant;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Repo.EtudiantRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantService implements IetudiantService{

    private EtudiantRepository repository;
    @Override
    public Etudiant add(Etudiant etudiant) {
        return repository.save(etudiant);
    }

    @Override
    public List<Etudiant> addall(List<Etudiant> etudiants) {
        return repository.saveAll(etudiants);
    }

    @Override
    public Etudiant update(Etudiant etudiant) {
        return repository.save(etudiant);
    }

    @Override
    public List<Etudiant> findall() {
        return repository.findAll();
    }

    @Override
    public Etudiant findById(long id) {
        return repository.findById(id).orElse(
                Etudiant.builder()
                        .idEtudiant(0)
                        .cin(0)
                        .build()
        );
    }

    @Override
    public void delete(Etudiant etudiant) {
        repository.delete(etudiant);

    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);

    }
}
