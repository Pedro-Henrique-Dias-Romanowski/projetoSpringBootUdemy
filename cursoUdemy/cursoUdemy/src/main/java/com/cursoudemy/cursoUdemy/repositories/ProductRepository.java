package com.cursoudemy.cursoUdemy.repositories;

import com.cursoudemy.cursoUdemy.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
