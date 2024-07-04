package com.bank.Controller;

import com.bank.Model.compte;
import com.bank.Service.CompteServiceIM;
import com.bank.Service.Compteservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/cempte")
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
        Float Solde_initial = ((Number) payload.get("Solde_initial")).floatValue();
        String Date_creation = (String) payload.get("Date_creation");
        int idUser = ((Number) payload.get("idUser")).intValue();

        return compteService.creerCompte(type_compte, Solde_initial, Date_creation, idUser);
    }
}
