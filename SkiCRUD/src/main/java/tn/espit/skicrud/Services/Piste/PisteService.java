package tn.espit.skicrud.Services.Piste;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.espit.skicrud.DAO.Entities.Piste;
import tn.espit.skicrud.DAO.Repository.PisteRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PisteService implements IPiste{

    PisteRepository pisterepo;


    @Override
    public List<Piste> getPistesList() {
        return pisterepo.findAll();
    }

    @Override
    public Optional<Piste> getPisteById(long id) {
        return pisterepo.findById(id);
    }

    @Override
    public Piste createPiste(Piste piste) {
        return pisterepo.save(piste);
    }

    @Override
    public void deletePiste(long id) {
    pisterepo.deleteById(id);
    }

    @Override
    public Piste updatePiste(Piste p) {
      return pisterepo.save(p);

    }
}
