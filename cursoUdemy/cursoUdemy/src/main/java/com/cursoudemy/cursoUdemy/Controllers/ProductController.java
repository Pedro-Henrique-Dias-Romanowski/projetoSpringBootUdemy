package com.cursoudemy.cursoUdemy.Controllers;

import com.cursoudemy.cursoUdemy.entities.Category;
import com.cursoudemy.cursoUdemy.entities.Product;
import com.cursoudemy.cursoUdemy.services.CategoryService;
import com.cursoudemy.cursoUdemy.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/findAll")
    public ResponseEntity<List<Product>> findAll(){

        try{
            List<Product> listProducts = service.findAll();
            return listProducts != null ?  ResponseEntity.ok().body(listProducts)  : ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        try {
            Product product = service.findById(id);
            return ResponseEntity.ok().body(product);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
}
