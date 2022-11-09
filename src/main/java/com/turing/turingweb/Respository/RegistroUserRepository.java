package com.turing.turingweb.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turing.turingweb.Model.RegistroUser;

public interface RegistroUserRepository extends JpaRepository<RegistroUser,Long> {
    
}
