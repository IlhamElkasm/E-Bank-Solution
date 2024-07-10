package com.bank.Dao;

import com.bank.Model.utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface userDAO  extends JpaRepository<utilisateur, Integer> {

    Optional<utilisateur> findByEmail(String Email);
}
