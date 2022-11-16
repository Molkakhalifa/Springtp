package tn.esprit.exercice.exercice.service;

import tn.esprit.exercice.exercice.entity.Fournisseur;

import java.util.List;

public interface IFournisseurService {
    List<Fournisseur> retrieveAllFournisseurs();
    Fournisseur addFournisseur (Fournisseur f);
    Fournisseur updateFournisseur (Fournisseur f);
    Fournisseur retrieveFournisseur (Long id);
    void removeFournisseur (Long idFournisseur );
}
