package com.example.demo03.layer4;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo03.layer2.Burger;

@Service
public interface BurgerService {
    void addBurgerService(Burger obj1);
    void modifyBurgerService(Burger obj1);
    void removeBurgerService(Burger obj1);
    Burger findBurgerService(int bid);
    List<Burger> findAllBurgers();
    
}
