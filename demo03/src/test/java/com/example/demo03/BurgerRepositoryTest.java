package com.example.demo03;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo03.layer2.Burger;
import com.example.demo03.layer3.BurgerRepository;

@SpringBootTest
public class BurgerRepositoryTest {
@Autowired
BurgerRepository burger;
    @Test
    public void insertburgertest(){
        Burger bobj=new Burger();
        bobj.setBid(6);
        bobj.setBname("pizza");
        bobj.setBprice(650);
        burger.save(bobj);

    }
    @Test
    void updateburgertest(){
        Optional<Burger> boj=burger.findById(2);
        if(boj.isPresent()){
            Burger actBurger=boj.get();
            System.out.println("current burger id"+actBurger.getBid());
            System.out.println("cureent burger name "+actBurger.getBname());
            System.out.println("current burger cost "+actBurger.getBprice());
            actBurger.setBname("ruchitha");
            actBurger.setBprice(600);
            burger.save(actBurger);
        }else{
            throw new RuntimeException("burger not found ");
        }
    }
    @Test
    void deleteburgertest(){
        Optional<Burger> boj=burger.findById(2);
        if(boj.isPresent()){
            Burger actBurger=boj.get();
            System.out.println("current burger id"+actBurger.getBid());
            System.out.println("cureent burger name "+actBurger.getBname());
            System.out.println("current burger cost "+actBurger.getBprice());
            burger.delete(actBurger);

    }else{
         throw new RuntimeException("burger not found ");
    }

    
}
@Test
 void selectburgertest(){
    Optional<Burger> boj=burger.findById(3);
        if(boj.isPresent()){
            Burger actBurger=boj.get();
            System.out.println("current burger id"+actBurger.getBid());
            System.out.println("cureent burger name "+actBurger.getBname());
            System.out.println("current burger cost "+actBurger.getBprice());
            burger.save(actBurger);

 }
else{
       throw new RuntimeException("burger not found ");
}
}
@Test
void selectAllburger(){
    List<Burger>blList=(List<Burger>) burger.findAll();
    for (Burger burger1 : blList) {
         System.out.println("current burger id"+burger1.getBid());
            System.out.println("cureent burger name "+burger1.getBname());
            System.out.println("current burger cost "+burger1.getBprice());
        
    }
}
//service test


}