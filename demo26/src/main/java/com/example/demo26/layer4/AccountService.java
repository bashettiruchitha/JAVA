package com.example.demo26.layer4;

import java.util.List;

import com.example.demo26.layer2.Account;

public interface AccountService {
    
    Account  addaccount(Account account);
    Account updateAccount(int id,Account account);
    void removeaccount(int id);
    Account getAccountById(int id);
   List <Account> getAllAccount ();



}
