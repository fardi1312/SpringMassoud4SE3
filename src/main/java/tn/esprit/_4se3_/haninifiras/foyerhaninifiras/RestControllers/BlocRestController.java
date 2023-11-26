package tn.esprit._4se3_.haninifiras.foyerhaninifiras.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Bloc;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.Service.IblocService;

import java.util.List;

@RestController
@AllArgsConstructor
public class BlocRestController {

    IblocService service;


    @PostMapping("addBloc")
    public Bloc addBloc (@RequestBody Bloc bloc){
        return service.add(bloc);
    }


    @PutMapping("updateBloc")
    public Bloc updateBloc (@RequestBody  Bloc bloc){
        return service.update(bloc);
    }

    @PostMapping("addAll")
    public List<Bloc> addAll(@RequestBody List<Bloc> blocs){
        return service.addall(blocs);
    }

    @GetMapping("getBloc/{id}")
    public Bloc getBloc(@PathVariable("id") long id){
        return service.findById(id);
    }

    @GetMapping("getBlocId")
    public Bloc getBloc2(@RequestParam("id") long id){
        return service.findById(id);
    }




    @DeleteMapping("deleteBloc")
    public void delete(@RequestBody Bloc bloc){
        service.delete(bloc);
    }

    @DeleteMapping("deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        service.deleteById(id);
    }


    @GetMapping("Findbynom/{nom}")
    public List<Bloc> findByNom(@PathVariable("nom") String nom){
        return service.findByNom(nom);
    }


}
