package tn.esprit._4se3_.haninifiras.foyerhaninifiras.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Chambre;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Reservation;
import tn.esprit._4se3_.haninifiras.foyerhaninifiras.Service.IreservationService;

import java.util.List;

@ResponseBody
@AllArgsConstructor
public class ReservationRestController {
    IreservationService service ;

    @PostMapping("addReservation")
    public Reservation add(Reservation reservation){
        return  service.add(reservation);
    }

    @PutMapping("updateReservation")
    public Reservation update(@RequestBody Reservation reservation){
        return service.update(reservation);
    }

    @PostMapping("addAllReservation")
    public List<Reservation> addAll(@RequestBody List<Reservation> reservation){
        return service.addall(reservation);
    }

    @GetMapping("getreservation/{id}")
    public Reservation getResevation(@PathVariable("id") long id){
        return service.findById(id);
    }

    @DeleteMapping("deletechambre")
    public void delete(@RequestBody Reservation reservation){
        service.delete(reservation);
    }
}
