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
@Table(name="SECTEURACTIVITE")
public class SecteurActivite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSecteurActivite;
    private String codeSecteurActivite;
    private String libelleSecteurActivite;
    @ManyToMany(mappedBy = "secteurActivites")
    private Set<Fournisseur> fournisseurs;
}
