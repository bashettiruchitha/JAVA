package com.example.demo19.layer2;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo19.layer1.Resturant;

@Repository
public interface ResturantRespository extends CrudRepository <Resturant ,Integer> {
  Resturant findById(int id);
List<Resturant>findAll();
    
} 
