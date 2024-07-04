package com.bank.Service;

import com.bank.Dao.compteDAO;
import com.bank.Dao.userDAO;
import com.bank.Model.User;
import com.bank.Model.compte;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompteServiceIM implements Compteservice {

    @Autowired
    private compteDAO comptedao;

    @Autowired
    private userDAO userdao;

    public compte creerCompte(String typeCompte, Float soldeInitial, String dateCreation, int idUser) {
        User user = userdao.findById(idUser)
                .orElseThrow(() -> new RuntimeException("User not found"));

        compte compte = new compte();
        compte.setType_compte(typeCompte);
        compte.setSolde_initial(soldeInitial);
        compte.setDate_creation(dateCreation);
        compte.setUser(user); // Associer l'utilisateur au compte

        return comptedao.save(compte);
    }

    @Override
    public List<compte> getAllComptes() {
        return comptedao.findAll();
    }

    public 
}
