package tn.esprit.exercice.exercice.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="DETAILFOURNISSEUR")
public class DetailFournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailFournisseur ;
    private String adresse ;
    private String matricule ;
    @Temporal(TemporalType.DATE)
    private Date dateCDebutCollaboration;
    @OneToOne(mappedBy = "detailFournisseur")
    private Fournisseur fournisseur;


}
