package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Reservation;
import java.util.List;

public interface ReservationService {
    Reservation addReservation(Reservation r);
    Reservation updateReservation(Reservation r);
    void deleteReservation(String id);
    Reservation getReservation(String id);
    List<Reservation> getAllReservations();
}
