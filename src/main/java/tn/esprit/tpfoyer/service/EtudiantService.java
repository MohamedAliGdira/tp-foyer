package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Etudiant;
import java.util.List;

public interface EtudiantService {
    Etudiant addEtudiant(Etudiant e);
    Etudiant updateEtudiant(Etudiant e);
    void deleteEtudiant(Long id);
    Etudiant getEtudiant(Long id);
    List<Etudiant> getAllEtudiants();
}
