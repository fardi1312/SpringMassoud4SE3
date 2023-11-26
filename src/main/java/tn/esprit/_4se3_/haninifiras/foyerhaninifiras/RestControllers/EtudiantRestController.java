package tn.esprit._4se3_.haninifiras.foyerhaninifiras.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Chambre;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Etudiant;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.Service.IetudiantService;

import java.util.List;

@RestController
@AllArgsConstructor
public class EtudiantRestController {

    IetudiantService service;

    @PostMapping("addEtudiant")
    public Etudiant add(Etudiant etudiant){
        return  service.add(etudiant);
    }

    @PutMapping("updateEtudiant")
    public Etudiant update(@RequestBody Etudiant etudiant){
        return service.update(etudiant);
    }

    @PostMapping("addAllEtidant")
    public List<Etudiant> addAll(@RequestBody List<Etudiant> etudiants){
        return service.addall(etudiants);
    }

    @GetMapping("getetudiant/{id}")
    public Etudiant getEtudiant(@PathVariable("id") long id){
        return service.findById(id);
    }

    @DeleteMapping("deleteEtudiant")
    public void delete(@RequestBody Etudiant etudiant){
        service.delete(etudiant);
    }
}
