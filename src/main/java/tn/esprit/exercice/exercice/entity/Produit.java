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
@Table(name="PRODUIT")

public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long idProduit;
    private String codeProduit;
    private String libelleProduit;
    private float prix;
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    @Temporal(TemporalType.DATE)
    private Date dateModification;
    @OneToMany (mappedBy = "produit")
    private Set<DetailFacture > detailFactures;
    @ManyToOne
    private Stock stock;
    @ManyToOne
    private CategorieProduit categorieProduit;

}
