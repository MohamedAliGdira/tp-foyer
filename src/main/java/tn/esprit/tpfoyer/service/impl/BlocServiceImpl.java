package tn.esprit.tpfoyer.service.impl;

import tn.esprit.tpfoyer.entity.Bloc;
import tn.esprit.tpfoyer.repositories.BlocRepository;
import tn.esprit.tpfoyer.service.BlocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BlocServiceImpl implements BlocService {

    @Autowired
    private BlocRepository blocRepository;

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
}
