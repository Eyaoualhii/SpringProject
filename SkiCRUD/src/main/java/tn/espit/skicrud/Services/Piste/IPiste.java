package tn.espit.skicrud.Services.Piste;

import tn.espit.skicrud.DAO.Entities.Piste;

import java.util.List;
import java.util.Optional;

public interface IPiste {

    List<Piste> getPistesList();
    public Optional<Piste> getPisteById(long id);
    public Piste createPiste(Piste piste);
    public void deletePiste(long id);

    public Piste updatePiste(Piste p);
}
