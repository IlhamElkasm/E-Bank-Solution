package com.bank.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    private String Name;
    private String Email;
    private  String Password;

    @JsonIgnore
    @OneToMany(mappedBy="user")
    private Set<compte> comptes;

    @JsonIgnore
    @OneToMany(mappedBy="user")
    private Set<Carte> cartes;
}
