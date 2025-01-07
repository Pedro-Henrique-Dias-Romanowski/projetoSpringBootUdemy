package com.cursoudemy.cursoUdemy.Controllers;

import com.cursoudemy.cursoUdemy.entities.User;
import org.springframework.http.ResponseEntity;

public class UserController {

    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Pedro Henrique", "pedro@gmail", "12345", "pedro123");
        return ResponseEntity.ok().body(u);
    }
}
