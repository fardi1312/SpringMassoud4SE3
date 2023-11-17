package com.example.foyer_benslimene_aziz.services;


import com.example.foyer_benslimene_aziz.DAO.entities.Reservation;
import com.example.foyer_benslimene_aziz.DAO.repo.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService implements IReservationService {

     ReservationRepository repository;
    @Override
    public Reservation add(Reservation reservation) {
        return repository.save(reservation);
    }

    @Override
    public List<Reservation> addall(List<Reservation> reservations) {
        return repository.saveAll(reservations);
    }

    @Override
    public Reservation update(Reservation reservation) {
        return repository.save(reservation);
    }

    @Override
    public List<Reservation> findall() {
        return repository.findAll();
    }

    @Override
    public Reservation findById(long id) {
        return repository.findById(id).orElse(
                Reservation.builder()
                        .idReservation(0)
                        .estValide(false).build()
        );
    }

    @Override
    public void delete(Reservation reservation) {
        repository.delete(reservation);

    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);

    }
}
