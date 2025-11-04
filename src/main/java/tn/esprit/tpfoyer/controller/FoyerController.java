package tn.esprit.tpfoyer.controller;

import tn.esprit.tpfoyer.entity.Foyer;
import tn.esprit.tpfoyer.service.FoyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/foyers")
public class FoyerController {

    @Autowired
    private FoyerService foyerService;

    @PostMapping
    public Foyer addFoyer(@RequestBody Foyer f) {
        return foyerService.addFoyer(f);
    }

    @GetMapping
    public List<Foyer> getAllFoyers() {
        return foyerService.getAllFoyers();
    }

    @GetMapping("/{id}")
    public Foyer getFoyer(@PathVariable Long id) {
        return foyerService.getFoyer(id);
    }

    @PutMapping
    public Foyer updateFoyer(@RequestBody Foyer f) {
        return foyerService.updateFoyer(f);
    }

    @DeleteMapping("/{id}")
    public void deleteFoyer(@PathVariable Long id) {
        foyerService.deleteFoyer(id);
    }
}
