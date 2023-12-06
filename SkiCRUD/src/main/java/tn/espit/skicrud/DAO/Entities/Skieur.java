package tn.espit.skicrud.DAO.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Skieur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numSkieur;
    private String nomS;
    private String prenomS;
    private LocalDate dateNaissance;
    private String ville;


    @OneToMany(mappedBy = "skieur")
    List<Inscription> inscriptions;

    @OneToOne
    Abonnement abonnements;

    @ManyToMany
   List<Piste>  piste;
}
