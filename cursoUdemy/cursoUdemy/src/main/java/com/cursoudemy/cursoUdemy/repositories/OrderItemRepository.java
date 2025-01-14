package com.cursoudemy.cursoUdemy.repositories;

import com.cursoudemy.cursoUdemy.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
