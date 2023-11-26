package tn.esprit._4se3_.haninifiras.foyerhaninifiras.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Bloc;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Chambre;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.Service.IchambreService;

import java.util.List;


@RestController
@AllArgsConstructor
public class ChambreRestController {

    IchambreService service ;

    @PostMapping("addChambre")
    public Chambre add(Chambre chambre){
        return  service.add(chambre);
    }

    @PutMapping("updateChmabre")
    public Chambre update(@RequestBody Chambre chambre){
        return service.update(chambre);
    }

    @PostMapping("addAllChambre")
    public List<Chambre> addAll(@RequestBody List<Chambre> chambres){
        return service.addall(chambres);
    }

    @GetMapping("getchambre/{id}")
    public Chambre getChambre(@PathVariable("id") long id){
        return service.findById(id);
    }

    @DeleteMapping("deletechambre")
    public void delete(@RequestBody Chambre chambre){
        service.delete(chambre);
    }



}
