package com.cursoudemy.cursoUdemy.services;


import com.cursoudemy.cursoUdemy.entities.Category;
import com.cursoudemy.cursoUdemy.entities.Product;
import com.cursoudemy.cursoUdemy.repositories.CategoryRepository;
import com.cursoudemy.cursoUdemy.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> product = repository.findById(id);
        return product.get();
    }
}
