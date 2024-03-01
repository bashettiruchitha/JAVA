package com.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

public class Test2{
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext();
        System.out.println("ctx is ready"+ctx);
        BurgerController burgerController=ctx.getBean(BurgerController.class);
        burgerController.takeOrder();
    }
}


    

@Component
class Burger{
    Burger(){
        System.out.println("burger()")
    }
    void TypeOfBurger(){
        System.out.println("type of burger");
    }
}
@Repository
class BurgerRepository{
    @Autowired
    Burger burger;
    BurgerRepository(){
        System.out.println("BurgerRepository()");
    }
    void makingTheBurger(){
        System.out.println("making the burger");
        burger.TypeOfBurger();
    }
}
@Service
class  BurgerService{
    @Autowired
    BurgerRepository burgerRepository;
    BurgerService(){
        System.out.println("burgerservice()");
    }
    void serveTheBurger(){
        System.out.println("serve the burger");
        burgerRepository.makingTheBurger();
    }
}
@Controller
class BurgerController{
    @Autowired
BurgerService servBurgerService;
    BurgerController(){
        System.out.println("burger controller");
    }
    void takeOrder(){
        System.out.println("taking the order");
        servBurgerService.serveTheBurger();
    }
}

