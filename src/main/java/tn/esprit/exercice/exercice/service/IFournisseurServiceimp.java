package tn.esprit.exercice.exercice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.exercice.exercice.entity.Fournisseur;
import tn.esprit.exercice.exercice.repository.FournisseurRepo;

import java.util.List;
@Service
public class IFournisseurServiceimp extends IgenericServiceimp <Fournisseur,Long> implements IFournisseurService{

    @Autowired
    FournisseurRepo fournisseurRepo;
    @Override
    public List<Fournisseur> retrieveAllFournisseurs() {
        return fournisseurRepo.findAll();
    }

    @Override
    public Fournisseur addFournisseur(Fournisseur f) {
        return fournisseurRepo.save(f);
    }

    @Override
    public Fournisseur updateFournisseur(Fournisseur f) {
        return fournisseurRepo.save(f);
    }

    @Override
    public Fournisseur retrieveFournisseur(Long id) {
        return fournisseurRepo.findById(id).orElse(null);
    }
    @Override
    public void removeFournisseur(Long id) {
        fournisseurRepo.deleteById(id);
    }

}
