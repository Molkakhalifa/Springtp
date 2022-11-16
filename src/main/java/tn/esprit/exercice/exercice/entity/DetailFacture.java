package tn.esprit.exercice.exercice.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="DETAILFACTURE")
public class DetailFacture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDetailFacture;
    private Integer qteCommandee;
    private float prixTotalDetail;
    private Integer pourcentageRemise;
    private float montantRemise;
    @ManyToOne
    private Facture facture;
    @ManyToOne
    private Produit produit;
}
