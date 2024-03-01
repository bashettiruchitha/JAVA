package com.kpit.demo9.layer4;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kpit.demo9.layer2.Pizza;
@Service
public interface PizzaService {
    
    Pizza orderingAPizza(int id);
	List<Pizza> getAllPizzas(int x);
	
	void createPizza(Pizza pizza);
	Pizza modifyPizza(Pizza pizza);
	void  deletePizza(int id);
}
