package com.bank.Service;

import com.bank.Model.compte;

import java.util.List;

public interface Compteservice {

    compte creerCompte(String type_compte,
                       Float solde_initial,
                       String date_creation,
                       int idUser);

    List<compte> getAllComptes();
    double getCompteSold(int idCompte);
    void fermerCompte(int idCompte, String raisonFermeture);
}