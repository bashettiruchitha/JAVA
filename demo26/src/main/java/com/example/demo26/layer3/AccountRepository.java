package com.example.demo26.layer3;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo26.layer2.Account;

public interface AccountRepository extends CrudRepository <Account,Integer>{

   Account findById(int id);
   List<Account> findAll();

}
