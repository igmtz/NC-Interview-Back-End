package com.pizzaNetManager.repo;

import com.pizzaNetManager.modelo.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
