package com.example.demo03.layer3;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo03.layer2.Burger;

@Repository

public interface BurgerRepository extends CrudRepository<Burger,Integer>{

    
}