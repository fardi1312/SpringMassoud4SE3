package com.example.foyer_benslimene_aziz.services;

import com.example.foyer_benslimene_aziz.DAO.entities.Reservation;

import java.util.List;

public interface IReservationService {

    Reservation add(Reservation reservation);

    List<Reservation> addall(List<Reservation> reservations);

    Reservation update(Reservation reservation);

    List<Reservation> findall();

    Reservation findById(long id);

    void delete (Reservation reservation);

    void deleteById(long id);
}
