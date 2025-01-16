package com.cursoudemy.cursoUdemy.services;

import com.cursoudemy.cursoUdemy.entities.User;
import com.cursoudemy.cursoUdemy.repositories.UserRepository;
import com.cursoudemy.cursoUdemy.services.exceptions.DataBaseException;
import com.cursoudemy.cursoUdemy.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
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

    public User findById(Long id){
        Optional<User> user = repository.findById(id);
        return user.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User save(User user){
        return repository.save(user);
    }

    public void delete(Long id) {
        try {
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id);
        } catch (DataIntegrityViolationException e){
            throw  new DataBaseException(e.getMessage());
        }
    }

    public User upadte (Long id, User user){
        user.setId(id);
        return repository.save(user);
    }

}
