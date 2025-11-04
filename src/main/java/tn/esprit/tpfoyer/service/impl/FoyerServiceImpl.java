package tn.esprit.tpfoyer.service.impl;
import tn.esprit.tpfoyer.entity.Foyer;
import tn.esprit.tpfoyer.repositories.FoyerRepository;
import tn.esprit.tpfoyer.service.FoyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FoyerServiceImpl implements FoyerService {

    @Autowired
    private FoyerRepository foyerRepository;

    @Override
    public Foyer addFoyer(Foyer f) { return foyerRepository.save(f); }

    @Override
    public Foyer updateFoyer(Foyer f) { return foyerRepository.save(f); }

    @Override
    public void deleteFoyer(Long id) { foyerRepository.deleteById(id); }

    @Override
    public Foyer getFoyer(Long id) { return foyerRepository.findById(id).orElse(null); }

    @Override
    public List<Foyer> getAllFoyers() { return foyerRepository.findAll(); }
}