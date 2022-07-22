package com.pizzaNetManager;

import com.pizzaNetManager.modelo.Pizza;
import com.pizzaNetManager.service.PizzaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pizza")
public class PizzaResource {

    private final PizzaService pizzaService;

    public  PizzaResource(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @GetMapping("/allPizzas")
    public ResponseEntity<List<Pizza>> getAllPizzas() {
        List<Pizza> pizzas = pizzaService.getAllPizzas();
        return new ResponseEntity<>(pizzas, HttpStatus.OK);
    }

    @PostMapping("/addPizza")
    public ResponseEntity<Pizza> addPizza(@RequestBody Pizza pizza) {
        Pizza newPizza = pizzaService.addPizza(pizza);
        return new ResponseEntity<>(newPizza, HttpStatus.CREATED);
    }
}
