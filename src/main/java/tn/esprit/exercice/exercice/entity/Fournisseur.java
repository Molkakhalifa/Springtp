package tn.esprit.exercice.exercice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="FOURNISSEUR")

public class Fournisseur {
    @Id
    @GeneratedValue(strategy  =GenerationType.IDENTITY)
    private Long idFournisseur ;
    private String codeFournisseur;
    private String libelleFournisseur;

    @Enumerated(EnumType.STRING)
    private CategorieFournisseur categorieFournisseur;
@OneToMany (mappedBy = "fournisseur")
    private Set<Facture> factures;
@ManyToMany
private Set<SecteurActivite> secteurActivites;
@OneToOne
    private DetailFournisseur detailFournisseur;
}
