package com.turing.turingweb.Respository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.turing.turingweb.Model.User;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
   
}
