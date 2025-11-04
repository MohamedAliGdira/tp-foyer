package tn.esprit.tpfoyer.controller;

import tn.esprit.tpfoyer.entity.Universite;
import tn.esprit.tpfoyer.service.UniversiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/universites")
public class UniversiteController {

    @Autowired
    private UniversiteService universiteService;

    @PostMapping
    public Universite addUniversite(@RequestBody Universite universite) {
        return universiteService.addUniversite(universite);
    }

    @GetMapping
    public List<Universite> getAllUniversites() {
        return universiteService.getAllUniversites();
    }

    @GetMapping("/{id}")
    public Universite getUniversite(@PathVariable Long id) {
        return universiteService.getUniversite(id);
    }

    @PutMapping
    public Universite updateUniversite(@RequestBody Universite universite) {
        return universiteService.updateUniversite(universite);
    }

    @DeleteMapping("/{id}")
    public void deleteUniversite(@PathVariable Long id) {
        universiteService.deleteUniversite(id);
    }
}
