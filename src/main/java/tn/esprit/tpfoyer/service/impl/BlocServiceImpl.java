package tn.esprit.tpfoyer.service.impl;

import tn.esprit.tpfoyer.entity.Bloc;
import tn.esprit.tpfoyer.entity.Chambre;
import tn.esprit.tpfoyer.repositories.BlocRepository;
import tn.esprit.tpfoyer.repositories.ChambreRepository;
import tn.esprit.tpfoyer.service.BlocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlocServiceImpl implements BlocService {

    @Autowired
    private BlocRepository blocRepository;
    @Autowired
    private ChambreRepository chambreRepository;
    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public Bloc updateBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public void deleteBloc(Long id) {
        blocRepository.deleteById(id);
    }

    @Override
    public Bloc getBloc(Long id) {
        return blocRepository.findById(id).orElse(null);
    }

    @Override
    public List<Bloc> getAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc affecterChambreABLoc(List<Long> numChambres, Long idBloc) {
        Bloc bloc = blocRepository.findById(idBloc).orElseThrow(() -> new RuntimeException("Bloc introuvable avec l'id : " + idBloc));
        if (bloc.getChambres() == null) {
            bloc.setChambres(new ArrayList<>());
        }
        for (Long numChambre : numChambres) {
            Chambre chambre = chambreRepository.findByNumeroChambre(numChambre).orElseThrow(() -> new RuntimeException("Chambre introuvable avec le numéro : " + numChambre));
            if (chambre.getBloc() != null) {
                throw new RuntimeException("La chambre " + numChambre + " est déjà associée à un bloc");
            }
            chambre.setBloc(bloc);
            bloc.getChambres().add(chambre);
            chambreRepository.save(chambre);
        }
        return blocRepository.save(bloc);
    }
}
