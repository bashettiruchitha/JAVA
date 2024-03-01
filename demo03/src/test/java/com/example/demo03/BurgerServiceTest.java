package com.example.demo03;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo03.layer2.Burger;
import com.example.demo03.layer4.BurgerService;

@SpringBootTest

public class BurgerServiceTest {

@Autowired
BurgerService burgerservice;

@Test
 public void addBurgerServiceTest(){
    Burger b2=new Burger();
    b2.setBid(108);
    b2.setBname("chicken");
    b2.setBprice(500);
    burgerservice.addBurgerService(b2);
}

@Test
public void servicetestformodifyburger(){
    Burger b2=new Burger();
    b2.setBid(5);
    b2.setBname("pizzaburger");
    b2.setBprice(600);
    burgerservice.modifyBurgerService(b2);

}
@Test 
public void deletingBurger(){
    Burger b2=new Burger();
    b2.setBid(4);
    burgerservice.removeBurgerService(b2);
}
@Test
public void serviceTestforsingleburger(){
    Burger b2=burgerservice.findBurgerService(2);
    System.out.println("cureent bname"+b2.getBname());
    System.out.println("current bprize"+b2.getBprice());
}
@Test
public void servicefindallburger(){
    List<

}

}
