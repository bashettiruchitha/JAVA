package com.example.demo9.layer2;//1

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pizza")

public class Pizza {//2
@Id
@Column(name="pizzaid")
private  int pizzaNumber;

@Column(name="pizzatype",length = 20)
private String typeOfPizza;

@Column(name="pizzacost")
private double pizzaPrice;

    public int getPizzaNumber() {
        return pizzaNumber;
    }

    public void setPizzaNumber(int pizzaNumber) {
        this.pizzaNumber = pizzaNumber;
    }

    public String getTypeOfPizza() {
        return typeOfPizza;
    }

    public void setTypeOfPizza(String typeOfPizza) {
        this.typeOfPizza = typeOfPizza;
    }

    public double getPizzaPrice() {
        return pizzaPrice;
    }

    public void setPizzaPrice(double pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }

 
    public Pizza(){
        System.out.println("pizza created");
    }
}
