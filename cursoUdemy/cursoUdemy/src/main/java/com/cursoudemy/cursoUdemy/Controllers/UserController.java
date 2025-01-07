package com.cursoudemy.cursoUdemy.Controllers;

import com.cursoudemy.cursoUdemy.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/users")
public class UserController {

    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Pedro Henrique", "pedro@gmail", "12345", "pedro123");
        return ResponseEntity.ok().body(u);
    }
}
