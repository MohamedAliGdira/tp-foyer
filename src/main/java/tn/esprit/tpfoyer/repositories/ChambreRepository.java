package tn.esprit.tpfoyer.repositories;

import tn.esprit.tpfoyer.entity.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ChambreRepository extends
        JpaRepository<Chambre, Long> {
}
