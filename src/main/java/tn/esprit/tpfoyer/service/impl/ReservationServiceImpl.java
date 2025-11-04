package tn.esprit.tpfoyer.service.impl;

import tn.esprit.tpfoyer.entity.Reservation;
import tn.esprit.tpfoyer.repositories.ReservationRepository;
import tn.esprit.tpfoyer.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public Reservation addReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public Reservation updateReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public void deleteReservation(String id) {
        reservationRepository.deleteById(Long.valueOf(id));
    }

    @Override
    public Reservation getReservation(String id) {
        return reservationRepository.findById(Long.valueOf(id)).orElse(null);
    }

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }
}
