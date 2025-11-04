package tn.esprit.tpfoyer.service;
import tn.esprit.tpfoyer.entity.Foyer;
import java.util.List;

public interface FoyerService {
    Foyer addFoyer(Foyer f);
    Foyer updateFoyer(Foyer f);
    void deleteFoyer(Long id);
    Foyer getFoyer(Long id);
    List<Foyer> getAllFoyers();
}