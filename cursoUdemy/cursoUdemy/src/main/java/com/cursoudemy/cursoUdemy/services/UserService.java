package com.cursoudemy.cursoUdemy.services;

import com.cursoudemy.cursoUdemy.entities.User;
import com.cursoudemy.cursoUdemy.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public Optional<User> findById(Long id){
        return repository.findById(id);
    }

    public User save(User user){
        return repository.save(user);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }
}
