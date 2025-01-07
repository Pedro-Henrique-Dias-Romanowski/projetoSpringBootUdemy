package com.cursoudemy.cursoUdemy.Controllers;

import com.cursoudemy.cursoUdemy.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserControler {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Pedro", "pedro@gmail", "12345", "senha123");
        return ResponseEntity.ok().body(u);
    }
}
