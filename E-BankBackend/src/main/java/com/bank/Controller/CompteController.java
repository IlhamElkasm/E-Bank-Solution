package com.bank.Controller;

import com.bank.Model.compte;
import com.bank.Service.CompteServiceIM;
import com.bank.Service.Compteservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/compte")
@CrossOrigin(origins = "http://localhost:4200/")
public class CompteController {

    @Autowired
    CompteServiceIM compteService;

    @GetMapping("/affiche")
    public List<compte> getAllComptes() {
        return compteService.getAllComptes();
    }


    @PostMapping("/creat")
    public compte creerCompte(@RequestBody Map<String, Object> payload) {
        String type_compte = (String) payload.get("type_compte");
        Float solde_initial = ((Number) payload.get("solde_initial")).floatValue();
        String date_creation = (String) payload.get("date_creation");
        int idUser = ((Number) payload.get("idUser")).intValue();

        return compteService.creerCompte(type_compte, solde_initial, date_creation, idUser);
    }

    @GetMapping("/{idCompte}")
    public double getCompteSold(@PathVariable int idCompte) {
        return compteService.getCompteSold(idCompte);
    }

    @PostMapping("/fermer")
    public String fermerCompte(@RequestBody Map<String, Object> payload) {
        int idCompte = ((Number) payload.get("idCompte")).intValue();
        String raisonFermeture = (String) payload.get("raisonFermeture");

        compteService.fermerCompte(idCompte, raisonFermeture);

        return "Compte fermé avec succès";
    }

}
