package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Bloc;
import java.util.List;

public interface BlocService {
    Bloc addBloc(Bloc b);
    Bloc updateBloc(Bloc b);
    void deleteBloc(Long id);
    Bloc getBloc(Long id);
    List<Bloc> getAllBlocs();
    Bloc affecterChambreABLoc(List<Long> numChambre,Long idBloc);
}


