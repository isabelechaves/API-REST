package com.projetojava.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetojava.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
    
} 