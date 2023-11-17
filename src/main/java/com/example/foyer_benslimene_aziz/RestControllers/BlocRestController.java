package com.example.foyer_benslimene_aziz.RestControllers;


import com.example.foyer_benslimene_aziz.DAO.entities.Bloc;
import com.example.foyer_benslimene_aziz.services.IBlocService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("blocReset")
public class BlocRestController {

    IBlocService iBlocService;

    @PostMapping("addBloc")

    public Bloc addBloc(@RequestBody Bloc b) {
        return iBlocService.add(b);
    }

    @PutMapping("updateBloc")

    public Bloc updateBloc(@RequestBody Bloc b) {
        return iBlocService.update(b);

    }
    @PostMapping("addAll")
    public List<Bloc> addAll(@RequestBody List<Bloc> blocs){
        return iBlocService.addAll(blocs);
    }
    //http://localhost:8083/findBlocById/1 => ordre par expl id/nom , premier valeur est pour id
    @GetMapping("findBlocById/{id}")
    public Bloc findBlocById(@PathVariable("id") long id) {
        return iBlocService.findById(id);
    }
        //http://localhost:8083/findBlocById2?id=1
        @GetMapping("findBlocById2")
        public Bloc findBlocById2(@RequestParam("id") long id){
            return iBlocService.findById(id);
    }

    @DeleteMapping("delete")

    public void delete(@RequestBody Bloc b) {
        iBlocService.delete(b);
    }

    @DeleteMapping("deleteById/{id}")
    public void deleteById(@PathVariable("id") long id) {
         iBlocService.deleteById(id);
    }


    @PutMapping("slectedByNom")

    public List<Bloc>  findByNomBloc(@RequestParam String nomBloc )
        {
        return  iBlocService.selectedNyNomBloc(nomBloc);

    }



}
