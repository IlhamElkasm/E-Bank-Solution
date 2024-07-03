package com.bank.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class compte {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCompte;
    private String type_compte;
    private Float Solde_initial;
    private String Date_creation;

    @ManyToOne
    @JoinColumn(name="idUser", nullable=false)
    private User user;
}
