package tn.esprit.tpfoyer.repositories;

import tn.esprit.tpfoyer.entity.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlocRepository extends
        JpaRepository<Bloc, Long> {

}
