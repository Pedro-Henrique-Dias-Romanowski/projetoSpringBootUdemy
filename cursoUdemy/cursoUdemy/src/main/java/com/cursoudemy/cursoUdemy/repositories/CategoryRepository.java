package com.cursoudemy.cursoUdemy.repositories;

import com.cursoudemy.cursoUdemy.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
