package com.cursoudemy.cursoUdemy.services;


import com.cursoudemy.cursoUdemy.entities.Category;
import com.cursoudemy.cursoUdemy.entities.Order;
import com.cursoudemy.cursoUdemy.repositories.CategoryRepository;
import com.cursoudemy.cursoUdemy.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> category = repository.findById(id);
        return category.get();
    }
}
