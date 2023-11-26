package tn.esprit._4se3_.haninifiras.foyerhaninifiras.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Chambre;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Universite;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.Service.IuniversiteService;

import java.util.List;
@AllArgsConstructor
@RestController
public class UniversiteRestController {
    IuniversiteService service ;

    @PostMapping("addUniversite")
    public Universite add(@RequestBody  Universite universite){
        return  service.add(universite);
    }

    @PutMapping("updateUniversite")
    public Universite update(@RequestBody Universite universite){
        return service.update(universite);
    }

    @PostMapping("addAllUniversite")
    public List<Universite> addAll(@RequestBody List<Universite> universites){
        return service.addall(universites);
    }

    @GetMapping("getUniversite/{id}")
    public Universite getUniversite(@PathVariable("id") long id){
        return service.findById(id);
    }

    @DeleteMapping("deleteUniversite")
    public void delete(@RequestBody Universite universite){
        service.delete(universite);
    }
}
