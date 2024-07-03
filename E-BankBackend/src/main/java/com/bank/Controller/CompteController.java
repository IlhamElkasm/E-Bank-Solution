package com.bank.Controller;

import com.bank.Model.compte;
import com.bank.Service.Compteservie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CompteController {

    @Autowired
    private Compteservie compteservie;
    @PostMapping
    public compte creerCompte(@RequestBody compte compte) {
        return compteservie.creerCompte(compte);
    }
}
