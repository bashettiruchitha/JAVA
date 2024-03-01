package com.example.demo21.layer3;

import org.springframework.data.repository.CrudRepository;

import com.example.demo21.layer2.CurrentAccount1;

public interface AccountRepository extends CrudRepository<CurrentAccount1,Integer> {
    
}
