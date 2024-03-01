package com.example.springangularproject.layer3;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springangularproject.layer2.Resturant;

@Repository
public interface ResturantRepository extends CrudRepository<Resturant, Integer>{
    
}
