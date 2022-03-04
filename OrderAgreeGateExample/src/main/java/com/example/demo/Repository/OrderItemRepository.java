package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.OrderItem;
@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
