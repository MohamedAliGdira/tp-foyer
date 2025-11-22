package tn.esprit.tpfoyer.service.impl;

import tn.esprit.tpfoyer.entity.Foyer;
import tn.esprit.tpfoyer.entity.Universite;
import tn.esprit.tpfoyer.repositories.FoyerRepository;
import tn.esprit.tpfoyer.repositories.UniversiteRepository;
import tn.esprit.tpfoyer.service.UniversiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UniversiteServiceImpl implements UniversiteService {

    @Autowired
    private UniversiteRepository universiteRepository;
    @Autowired
    private FoyerRepository foyerRepository;

    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public void deleteUniversite(Long id) {
        universiteRepository.deleteById(id);
    }

    @Override
    public Universite getUniversite(Long id) {
        return universiteRepository.findById(id).orElse(null);
    }

    @Override
    public List<Universite> getAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite desaffecterFoyerAUniversite(Long IdUniversite) {
        Universite universite = universiteRepository.findById(IdUniversite).orElseThrow(()->new RuntimeException("universite non trouve"+IdUniversite));
        Foyer foyer = universite.getFoyer();
        if(foyer == null) {
            throw new RuntimeException("l'universite n'a pas d'association avec un foyer") ;
        }
        universite.setFoyer(null);
        foyer.setUniversite(null);
        universiteRepository.save(universite);
        foyerRepository.save(foyer);

        return universite;
    }

    @Override
    public Universite affecterFoyerAUniversite(Long idFoyer, String nomUniversite) {
        Foyer foyer = foyerRepository.findById(idFoyer).orElseThrow(()-> new RuntimeException("foyer introuvable avec l'id:"+idFoyer));
        Universite universite=  universiteRepository.findByNomUniversite(nomUniversite).orElseThrow(()->new RuntimeException("universite introuvable avec le nom: "+nomUniversite));
        if(foyer.getUniversite()!=null || universite.getFoyer()!=null) {
            throw new RuntimeException("l'association deja existe") ;
        }
        universite.setFoyer(foyer);
        foyer.setUniversite(universite);
        universiteRepository.save(universite);
        foyerRepository.save(foyer);
        return universite;

    }

}
