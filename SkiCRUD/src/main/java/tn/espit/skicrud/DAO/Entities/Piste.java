package tn.espit.skicrud.DAO.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Piste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long numPiste;
    private String nomPiste;
    private Couleur couleur;
    private int longueur;
    private int pente;

    @ManyToMany(mappedBy = "piste")
    List<Skieur> skieurs;

}
