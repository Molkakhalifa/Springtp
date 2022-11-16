package tn.esprit.exercice.exercice.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.exercice.exercice.entity.Fournisseur;
import tn.esprit.exercice.exercice.service.IFournisseurService;

import java.util.List;
@RestController
@RequestMapping("/fournisseur")
public class FournisseurController {
    @Autowired
    IFournisseurService iFournisseurService;
    //localhost:9090/add

    @PostMapping("fournisseur/add")
    public Fournisseur addFournisseur(@RequestBody Fournisseur f ) {
        return iFournisseurService.addFournisseur(f);
    }

    @GetMapping("fournisseur/getall")
    public List<Fournisseur> retrieveAllFournisseur() {
        return iFournisseurService.retrieveAllFournisseurs();
    }

    @GetMapping("fournisseur/{id}")
    public Fournisseur retrieveAllDepartement(@PathVariable Long idFournisseur) {
        return iFournisseurService.retrieveFournisseur(idFournisseur);
    }

    @PutMapping("fournisseur/update")
    public Fournisseur updateFournisseur(@RequestBody Fournisseur f ) {
        return iFournisseurService.updateFournisseur( f);

    }

    @DeleteMapping("fournisseur/{id}")
    public void removeFournisseur(@PathVariable Long idFournisseur) {
        iFournisseurService.removeFournisseur( idFournisseur );

    }
}
