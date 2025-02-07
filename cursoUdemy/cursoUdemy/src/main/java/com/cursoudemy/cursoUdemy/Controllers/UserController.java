package com.cursoudemy.cursoUdemy.Controllers;

import com.cursoudemy.cursoUdemy.entities.User;
import com.cursoudemy.cursoUdemy.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/findAll")
    public ResponseEntity<List<User>> findAll(){
        try{
            List<User> listUsers = service.findAll();
            return listUsers != null ?  ResponseEntity.ok().body(listUsers)  : ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
            User user = service.findById(id);
            return ResponseEntity.ok().body(user);
    }

    @PostMapping("/save")
    public ResponseEntity<User> save(@RequestBody User user){
        try{
            user = service.save(user);
            return user != null ? ResponseEntity.status(HttpStatus.CREATED).body(user) : ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
            service.delete(id);
            if(service.findById(id) != null){
                return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
            } else {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User user){
        try{
            List<User> users = service.findAll();
            if (users.isEmpty()){
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            } else {
                User updateUser = service.upadte(id, user);
                return updateUser != null ? ResponseEntity.ok().body(updateUser) : ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
}
