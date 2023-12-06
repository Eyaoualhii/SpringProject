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
public class Cours {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numCours;
    private int nveau;
    private TypeCours typeCours;
    private Support support;
    private float prix;
    private int creneau;

    @OneToMany(mappedBy = "cours")
    List<Inscription> inscriptions;
}
