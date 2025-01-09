package com.cursoudemy.cursoUdemy.repositories;

import com.cursoudemy.cursoUdemy.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
