package tn.esprit.tpfoyer.controller;

import tn.esprit.tpfoyer.entity.Bloc;
import tn.esprit.tpfoyer.service.BlocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/blocs")
public class BlocController {

    @Autowired
    private BlocService blocService;

    @PostMapping
    public Bloc addBloc(@RequestBody Bloc b) {
        return blocService.addBloc(b);
    }

    @GetMapping
    public List<Bloc> getAllBlocs() {
        return blocService.getAllBlocs();
    }

    @GetMapping("/{id}")
    public Bloc getBloc(@PathVariable Long id) {
        return blocService.getBloc(id);
    }

    @PutMapping
    public Bloc updateBloc(@RequestBody Bloc b) {
        return blocService.updateBloc(b);
    }

    @DeleteMapping("/{id}")
    public void deleteBloc(@PathVariable Long id) {
        blocService.deleteBloc(id);
    }
}
