package tn.esprit.exercice.exercice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.exercice.exercice.entity.Fournisseur;

public interface ReglementRepo extends JpaRepository<Fournisseur,Integer> {
}
