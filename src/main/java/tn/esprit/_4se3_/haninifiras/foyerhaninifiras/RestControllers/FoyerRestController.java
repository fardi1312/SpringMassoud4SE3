package tn.esprit._4se3_.haninifiras.foyerhaninifiras.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Chambre;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Foyer;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.Service.IfoyerService;

import java.util.List;

@RestController
@AllArgsConstructor
public class FoyerRestController {
    IfoyerService service;

    @PostMapping("addfoyer")
    public Foyer add(Foyer foyer){
        return  service.add(foyer);
    }

    @PutMapping("updateFoyer")
    public Foyer update(@RequestBody Foyer foyer){
        return service.update(foyer);
    }

    @PostMapping("addAllFoyer")
    public List<Foyer> addAll(@RequestBody List<Foyer> foyers){
        return service.addall(foyers);
    }

    @GetMapping("getfoyer/{id}")
    public Foyer getFoyer(@PathVariable("id") long id){
        return service.findById(id);
    }

    @DeleteMapping("deletefoyer")
    public void delete(@RequestBody Foyer foyer){
        service.delete(foyer);
    }
}
