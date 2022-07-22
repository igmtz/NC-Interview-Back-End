package com.pizzaNetManager.service;

import com.pizzaNetManager.modelo.Pizza;
import com.pizzaNetManager.repo.PizzaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PizzaService {

    private final PizzaRepo pizzaRepo;

    @Autowired
    public PizzaService(PizzaRepo pizzaRepo){
        this.pizzaRepo = pizzaRepo;
    }

    public Pizza addPizza(Pizza pizza) {
        return pizzaRepo.save(pizza);
    }

    public List<Pizza> getAllPizzas() {
        return pizzaRepo.findAll();
    }
}
