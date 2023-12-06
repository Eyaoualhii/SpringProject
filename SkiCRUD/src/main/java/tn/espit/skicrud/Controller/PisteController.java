package tn.espit.skicrud.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.espit.skicrud.DAO.Entities.Piste;
import tn.espit.skicrud.Services.Piste.IPiste;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/pistes")
public class PisteController {

    IPiste pisteService;


    @GetMapping
    public List<Piste> getPistesList() {
        return pisteService.getPistesList();

    }

    @GetMapping("/{id}")
    public Optional<Piste> getBlocById(@PathVariable long id) {
        return  pisteService.getPisteById(id);

    }

    @PostMapping
    public Piste createBloc(@RequestBody Piste piste) {
        return  pisteService.createPiste(piste);


    }
    @DeleteMapping("/{id}")
    public void deletePiste(@PathVariable long id) {
        pisteService.deletePiste(id);
    }
    @PutMapping
    public void updatePiste(@RequestBody Piste p) {
        pisteService.updatePiste(p);
    }
}
