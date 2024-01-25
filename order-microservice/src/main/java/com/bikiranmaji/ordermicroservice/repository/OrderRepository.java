package com.bikiranmaji.ordermicroservice.repository;

import com.bikiranmaji.ordermicroservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
