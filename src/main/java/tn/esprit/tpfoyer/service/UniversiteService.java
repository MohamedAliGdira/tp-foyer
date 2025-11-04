package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Universite;
import java.util.List;

public interface UniversiteService {
    Universite addUniversite(Universite universite);
    Universite updateUniversite(Universite universite);
    void deleteUniversite(Long id);
    Universite getUniversite(Long id);
    List<Universite> getAllUniversites();
}
