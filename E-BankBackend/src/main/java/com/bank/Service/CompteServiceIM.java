package com.bank.Service;

import com.bank.Dao.compteDAO;
import com.bank.Model.compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompteServiceIM  implements  Compteservie{

    @Autowired
    private compteDAO daocompte;
    @Override
    public compte creerCompte(compte comptes) {
       return daocompte.save(comptes);

    }
}
