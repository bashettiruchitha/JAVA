package com.example.demo03.layer4;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo03.BurgerAlreadyExistException;
import com.example.demo03.BurgerNotFoundException;
import com.example.demo03.layer2.Burger;
import com.example.demo03.layer3.BurgerRepository;

public class BurgerServiceImpl implements BurgerService {
    @Autowired
    BurgerRepository brepo;

    @Override
    public void addBurgerService(Burger obj1) {
        Optional<Burger>bobj=brepo.findById(obj1.getBid());
        if(bobj.isPresent()){
            throw new BurgerAlreadyExistException("this id already there"+obj1.getBid());
        }else{
            brepo.save(obj1);
        }
        
       
    }

    @Override
    public void modifyBurgerService(Burger obj1) {
        Optional<Burger>bobj=brepo.findById(obj1.getBid());
        if(bobj.isPresent()){
            brepo.save(obj1);
            
        }else{
            throw new BurgerNotFoundException("this id already there"+obj1.getBid());
        }
        
    }

    @Override
    public void removeBurgerService(Burger obj1) {
        Optional<Burger>bobj=brepo.findById(obj1.getBid());
        if(bobj.isPresent()){
            brepo.delete(obj1);
            
        }else{
            throw new BurgerNotFoundException("this id already there"+obj1.getBid());
        }

        
    }

    @Override
    public Burger findBurgerService(int bid) {
    Burger burger2=null;
     Optional<Burger>bobj=brepo.findById(bid);
      if(bobj.isPresent()){
        burger2=bobj.get();

    }else{
        throw new BurgerNotFoundException("this id already there"+bobj.get());
        }
        return burger2;
    }

    @Override
    public List<Burger> findAllBurgers() {
    
     List<Burger> bList=(List<Burger>) brepo.findAll();
     return bList;
    }
    
}
