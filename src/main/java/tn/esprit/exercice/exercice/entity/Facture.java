package tn.esprit.exercice.exercice.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="FACTURE")

public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFacture;
    @Temporal(TemporalType.DATE)

    private Date dateCreationFacture;
    @Temporal(TemporalType.DATE)

    private Date dateDerniereModification;
    private float prixReservation;
    private boolean archive;
    private float montantFacture;
    private float montantRemise;
    @OneToMany(mappedBy = "facture")
    private Set<Reglement> reglements;
    @OneToMany(mappedBy = "facture")
    private Set<DetailFacture> detailFactures;
    @ManyToOne
    private Fournisseur fournisseur;
}
