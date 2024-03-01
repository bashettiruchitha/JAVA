
package com.example.demo9.layer3;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo9.layer2.Pizza;

@Repository
public interface PizzaRepository  extends CrudRepository<Pizza,Integer>{
    
}