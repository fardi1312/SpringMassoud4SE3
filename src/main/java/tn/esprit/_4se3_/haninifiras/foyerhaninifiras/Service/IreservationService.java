package tn.esprit._4se3_.haninifiras.foyerhaninifiras.Service;


import tn.esprit._4se3_.haninifiras.foyerhaninifiras.DAO.Entities.Reservation;

import java.util.List;

public interface IreservationService {
    Reservation add(Reservation reservation);

    List<Reservation> addall(List<Reservation> reservations);

    Reservation update(Reservation reservation);

    List<Reservation> findall();

    Reservation findById(long id);

    void delete (Reservation reservation);

    void deleteById(long id);
}
