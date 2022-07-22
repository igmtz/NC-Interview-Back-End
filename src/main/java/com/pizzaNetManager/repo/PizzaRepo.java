package com.pizzaNetManager.repo;

import com.pizzaNetManager.modelo.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PizzaRepo extends JpaRepository<Pizza, Long> {

}
