package com.example.foyer_benslimene_aziz.DAO.repo;


import com.example.foyer_benslimene_aziz.DAO.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
