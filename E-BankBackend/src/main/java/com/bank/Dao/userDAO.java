package com.bank.Dao;

import com.bank.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userDAO  extends JpaRepository<User, Integer> {
}
