package com.pizzaNetManager.modelo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long id;
    private Date date;
    private int numberPepperoniPizza;
    private int numberHawaiianPizza;
    private int totalPrice;

    public Order() {
    }

    public Order(Date date, int numberPepperoniPizza, int numberHawaiianPizza, int totalPrice) {
        this.date = date;
        this.numberPepperoniPizza = numberPepperoniPizza;
        this.numberHawaiianPizza = numberHawaiianPizza;
        this.totalPrice = totalPrice;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNumberPepperoniPizza() {
        return numberPepperoniPizza;
    }

    public void setNumberPepperoniPizza(int numberPepperoniPizza) {
        this.numberPepperoniPizza = numberPepperoniPizza;
    }

    public int getNumberHawaiianPizza() {
        return numberHawaiianPizza;
    }

    public void setNumberHawaiianPizza(int numberHawaiianPizza) {
        this.numberHawaiianPizza = numberHawaiianPizza;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}
