package com.bank.Model;


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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUser;
    private String Name;
    private String Email;
    private  String Password;

    @OneToMany(mappedBy="user")
    private Set<compte> comptes;
}
