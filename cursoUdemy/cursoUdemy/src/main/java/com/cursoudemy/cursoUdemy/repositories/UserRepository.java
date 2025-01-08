package com.cursoudemy.cursoUdemy.repositories;

import com.cursoudemy.cursoUdemy.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
