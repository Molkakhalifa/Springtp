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
@Table(name="CATEGORIEPRODUIT")
public class CategorieProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategorieProduit;
    private String codeProduit;
    private String libelleCategorieProduit;
    @OneToMany(mappedBy = "categorieProduit")
    private Set<Produit> produits;
}
