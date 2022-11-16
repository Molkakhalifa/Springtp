package tn.esprit.exercice.exercice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.exercice.exercice.entity.Produit;

public interface OperateurRepo extends JpaRepository<Produit,Integer> {
}
