package com.kpit.demo9.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kpit.demo9.layer2.Pizza;
import com.kpit.demo9.layer4.PizzaService;

@RestController
@RequestMapping("/pizzahut")
public class MyPizzaController {
    @GetMapping("/greet")
    public String welcome(){
        return "<h1> welcome</h1>";
    }
    @GetMapping("/home")
       public String homepage(){
        return "<h1> welcome to home</h1>";
    }
    @Autowired
    PizzaService pizzaService;
    @GetMapping("/getpizzas/{pid}")
    public List<Pizza> getAllPizzas(@PathVariable("pid")int x){
        System.out.println("getAllPizzas()is retrieving ");
        return pizzaService.getAllPizzas(x);

    }
}
